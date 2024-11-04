package com.example.kotlinPractice.feature.ingredient.api.dto

data class CreateIngredientDto(

    val kitchenId: Long,
    val refrigeratorId: Long,
    val ingredientCreateDtos: List<IngredientCreateDto>,
)
