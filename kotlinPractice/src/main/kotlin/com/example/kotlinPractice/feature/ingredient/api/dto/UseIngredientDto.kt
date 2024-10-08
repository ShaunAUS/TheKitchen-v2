package com.example.kotlinPractice.feature.ingredient.api.dto

data class UseIngredientDto(
    val kitchenId: Long,
    val refrigeratorId: Long,
    val ingredientUseDtos: List<IngredientUseDto>
)
