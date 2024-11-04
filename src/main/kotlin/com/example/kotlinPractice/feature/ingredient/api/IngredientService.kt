package com.example.kotlinPractice.feature.ingredient.api

import com.example.kotlinPractice.feature.ingredient.api.dto.CreateIngredientDto
import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientUpdateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientInfoDto

interface IngredientService {
    fun updateIngredientQuantity(ingredientUpdateDto: IngredientUpdateDto): IngredientInfoDto
    fun addIngredient(createIngredientDto: CreateIngredientDto): IngredientInfoDto
}
