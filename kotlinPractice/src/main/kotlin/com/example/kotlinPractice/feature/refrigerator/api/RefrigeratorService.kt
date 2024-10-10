package com.example.kotlinPractice.feature.refrigerator.api

import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientInfoDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto

interface RefrigeratorService {
    fun getRefrigerator(refrigeratorId: Long): IngredientInfoDto
    fun remove(refrigeratorId: Long)
    fun createRefrigerator(refrigeratorCreateDto: RefrigeratorCreateDto, kitchenId: Long): IngredientInfoDto
    fun updateRefrigerator(refrigeratorId: Long): IngredientInfoDto
}
