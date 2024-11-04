package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.entity.QImage.image
import com.example.kotlinPractice.domain.repository.querydsl.ImageRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory

class ImageRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,

) : ImageRepositoryCustom {
    override fun findByMenuId(menuId: Long?): List<Image> {
        return queryFactory
            .select(image)
            .from(image)
            .where(image.menu.id.eq(menuId))
            .fetch()
    }
}
