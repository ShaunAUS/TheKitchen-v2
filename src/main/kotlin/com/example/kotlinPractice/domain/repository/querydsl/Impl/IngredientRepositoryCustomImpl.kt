package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.entity.Ingredient
import com.example.kotlinPractice.domain.entity.QIngredient.ingredient
import com.example.kotlinPractice.domain.entity.QRefrigerator.refrigerator
import com.example.kotlinPractice.domain.repository.querydsl.IngredientRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory

class IngredientRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,

) : IngredientRepositoryCustom {
    override fun findByNameWithRefrigeratorId(ingredientName: String, refrigeratorId: Long): Ingredient? {
        return queryFactory
            .select(ingredient)
            .from(ingredient)
            .join(ingredient.refrigerator, refrigerator)
            .fetchJoin()
            .where(
                ingredient.name.eq(ingredientName)
                    .and(ingredient.refrigerator.id.eq(refrigeratorId)),
            )
            .fetchOne()
    }

    override fun findByName(ingredientName: String): Ingredient? {
        return queryFactory
            .select(ingredient)
            .from(ingredient)
            .where(ingredient.name.eq(ingredientName))
            .fetchOne()
    }
}
