package com.example.kotlinPractice.domain.repository.querydsl

import com.example.kotlinPractice.domain.entity.Ingredient

interface IngredientRepositoryCustom {
    fun findByNameWithRefrigeratorId(ingredientName: String, refrigeratorId: Long): Ingredient?
    fun findByName(ingredientName: String): Ingredient?
}
