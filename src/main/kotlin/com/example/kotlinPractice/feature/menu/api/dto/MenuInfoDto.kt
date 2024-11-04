package com.example.kotlinPractice.feature.menu.api.dto

import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.domain.enums.AlergicType

data class MenuInfoDto(
    val name: String,
    val price: Int,
    val alergicType: List<AlergicType>,
) {
    companion object {
        fun of(savedMenu: Menu): MenuInfoDto {
            return MenuInfoDto(
                name = savedMenu.name,
                price = savedMenu.price,
                alergicType = savedMenu.alergicTypes.map { alergic -> AlergicType.toType(alergic.type) },
            )
        }
    }
}
