package com.example.kotlinPractice.feature.ingredient.api

import com.example.kotlinPractice.feature.ingredient.api.dto.AddIngredientDto
import com.example.kotlinPractice.feature.ingredient.api.dto.UseIngredientDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto

interface IngredientService {
    fun useIngredient(useIngredientDto: UseIngredientDto): RefrigeratorInfoDto
    fun addIngredient(addIngredientDto: AddIngredientDto): RefrigeratorInfoDto
}
