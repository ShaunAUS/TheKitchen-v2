package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.entity.QMember.member
import com.example.kotlinPractice.domain.entity.QPrep.prep
import com.example.kotlinPractice.domain.repository.querydsl.MemberRepositoryCustom
import com.example.kotlinPractice.feature.member.api.dto.MemberPrepInfoDto
import com.example.kotlinPractice.global.error.ErrorCode
import com.example.kotlinPractice.global.error.exception.BusinessException
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.support.PageableExecutionUtils
import org.springframework.stereotype.Repository

// TODO 이게 진짜임
@Repository
class MemberRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,

) : MemberRepositoryCustom {
    override fun findMembers(page: Pageable): Page<Member> {
        val members = queryFactory
            .select(member)
            .from(member)
            .offset(page.offset)
            .limit(page.pageSize.toLong())
            .fetch()

        val totalCount = queryFactory
            .select(member.count())
            .from(member)

        return PageableExecutionUtils.getPage(members, page) {
            totalCount.fetchOne() ?: 0L
        }
    }

    override fun findBy(memberUniqueId: String): Member? {
        return queryFactory
            .select(member)
            .from(member)
            .where(member.uniqueId.eq(memberUniqueId))
            .fetchOne()
    }

    override fun findMemberWithPrepsBy(targetMemberUniqueId: Long): MemberPrepInfoDto {
        val memberWithPreps = queryFactory
            .selectFrom(member)
            .leftJoin(member.preps, prep).fetchJoin()
            .where(
                member.uniqueId.eq(targetMemberUniqueId.toString())
                    .and(member.deleteFlag.eq('N')),
            )
            .fetchOne() ?: throw BusinessException(ErrorCode.NOT_FOUND_MEMBER)

        return MemberPrepInfoDto.of(memberWithPreps)
    }
}
