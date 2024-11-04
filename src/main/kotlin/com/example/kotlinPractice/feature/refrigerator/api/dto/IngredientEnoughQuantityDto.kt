package com.example.kotlinPractice.feature.refrigerator.api.dto

import com.example.kotlinPractice.domain.entity.Ingredient
import com.example.kotlinPractice.domain.enums.EnoughType

data class IngredientEnoughQuantityDto(
    val name: String,
    val quantity: Int,
    val enoughType: EnoughType,

) {
    companion object {
        fun of(ingredient: Ingredient): IngredientEnoughQuantityDto {
            return IngredientEnoughQuantityDto(
                name = ingredient.name,
                quantity = ingredient.quantity,
                enoughType = ingredient.isEnoughQuantity(),
            )
        }
    }
}
