package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.entity.Alergic
import com.example.kotlinPractice.domain.entity.QAlergic.alergic
import com.example.kotlinPractice.domain.repository.querydsl.AlergicRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory

class AlergicRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,

) : AlergicRepositoryCustom {
    override fun findByMenuId(menuId: Long?): List<Alergic> {
        return queryFactory
            .select(alergic)
            .from(alergic)
            .where(alergic.menu.id.eq(menuId))
            .fetch()
    }
}
