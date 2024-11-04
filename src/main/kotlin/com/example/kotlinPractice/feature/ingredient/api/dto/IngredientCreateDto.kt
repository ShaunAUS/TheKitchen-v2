package com.example.kotlinPractice.feature.ingredient.api.dto

import java.time.LocalDate

data class IngredientCreateDto(

    val name: String,
    val buyDate: LocalDate,
    val expireDate: LocalDate,
    val expirationPeriod: Int,
    val quantity: Int,
) {
    companion object {
    }
}
