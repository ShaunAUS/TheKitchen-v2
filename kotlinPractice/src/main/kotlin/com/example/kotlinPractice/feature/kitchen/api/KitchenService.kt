package com.example.kotlinPractice.feature.kitchen.api

import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto
import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto

interface KitchenService {
    fun createKitchen(kitchenCreateDto: KitchenCreateDto): KitchenInfoDto
}
