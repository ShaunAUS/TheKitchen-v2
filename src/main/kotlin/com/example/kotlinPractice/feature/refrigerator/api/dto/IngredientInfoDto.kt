package com.example.kotlinPractice.feature.refrigerator.api.dto

import com.example.kotlinPractice.domain.entity.Refrigerator
import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientDto

data class IngredientInfoDto(

    val id: Long?,
    val name: String,
    val ingredients: List<IngredientDto>,

) {
    companion object {
        fun of(refrigerator: Refrigerator): IngredientInfoDto {
            return IngredientInfoDto(
                id = refrigerator.id,
                name = refrigerator.name,
                ingredients = refrigerator.ingredients.map { ingredient -> IngredientDto.of(ingredient) },
            )
        }
    }
}
