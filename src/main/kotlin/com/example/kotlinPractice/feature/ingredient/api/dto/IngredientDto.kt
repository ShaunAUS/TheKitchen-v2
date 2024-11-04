package com.example.kotlinPractice.feature.ingredient.api.dto

import com.example.kotlinPractice.domain.entity.Ingredient
import java.time.LocalDate

data class IngredientDto(

    val name: String,
    val buyDate: LocalDate,
    val expireDate: LocalDate,
    val expirationPeriod: Int, // TODO 스케줄러로 하루가 넘으면 -1 업데이트
    val quantity: Int,
) {
    companion object {
        fun of(ingredient: Ingredient): IngredientDto {
            return IngredientDto(
                name = ingredient.name,
                buyDate = ingredient.buyDate,
                expireDate = ingredient.expireDate,
                expirationPeriod = ingredient.expirationPeriod,
                quantity = ingredient.quantity,
            )
        }
    }
}
