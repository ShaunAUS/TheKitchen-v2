package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.entity.QMember.member
import com.example.kotlinPractice.domain.repository.querydsl.MemberRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.support.PageableExecutionUtils
import org.springframework.stereotype.Repository

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
}
