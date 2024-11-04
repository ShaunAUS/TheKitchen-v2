package com.example.kotlinPractice.feature.menu.api.dto

import com.example.kotlinPractice.domain.enums.AlergicType

data class MenuCreateDto(
    val name: String,
    val price: Int,
    val procedure: String,
    val alergicTypes: List<AlergicType>,
)
