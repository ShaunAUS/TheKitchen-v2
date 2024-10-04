package com.example.kotlinPractice.feature.refrigerator.api

import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto

interface RefrigeratorService {
    fun getRefrigerator(refrigeratorId: Long): RefrigeratorInfoDto
    fun remove(refrigeratorId: Long)
    fun createRefrigerator(refrigeratorCreateDto: RefrigeratorCreateDto, kitchenId:Long): RefrigeratorInfoDto
    fun updateRefrigerator(refrigeratorId: Long): RefrigeratorInfoDto
}