package com.example.kotlinPractice.feature.ingredient.api.dto

data class AddIngredientDto (

        val kitchenId :Long,
        val refrigeratorId: Long,
        val ingredientCreateDtos: List<IngredientCreateDto>
)