package com.example.kotlinPractice.feature.ingredient.api.dto

data class IngredientUpdateDto(
    val kitchenId: Long,
    val refrigeratorId: Long,
    val ingredientUpdateDtos: List<IngredientDto>,
)
