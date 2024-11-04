package com.example.kotlinPractice.feature.menu.api.dto

import com.example.kotlinPractice.domain.enums.AlergicType

data class MenuUpdateDto(
    val name: String,
    val price: Int,
    val alergicType: List<AlergicType>,
    val procedure: String,
    val menuId: Long,
)
