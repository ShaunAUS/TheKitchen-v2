package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.entity.Prep
import com.example.kotlinPractice.domain.entity.QPrep.prep
import com.example.kotlinPractice.domain.repository.querydsl.PrepRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory

class PrepRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,
) : PrepRepositoryCustom {
    override fun findByMemberId(targetMemberId: Long): List<Prep> {
        return queryFactory
            .select(prep)
            .from(prep)
            .where(prep.member.id.eq(targetMemberId))
            .fetch()
    }
}
