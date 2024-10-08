package com.example.kotlinPractice.feature.ingredient.api.dto

import com.example.kotlinPractice.domain.entity.Ingredient
import java.time.LocalDate

data class IngredientInfoDto(

    val name: String,
    val buyDate: LocalDate,
    val expireDate: LocalDate,
    val expirationPeriod: Int,
    val quantity: Int,
) {
    companion object {
        fun of(ingredient: Ingredient): IngredientInfoDto {
            return IngredientInfoDto(
                name = ingredient.name,
                buyDate = ingredient.buyDate,
                expireDate = ingredient.expireDate,
                expirationPeriod = ingredient.expirationPeriod,
                quantity = ingredient.quantity,
            )
        }
    }
}
