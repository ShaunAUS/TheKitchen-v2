package com.example.kotlinPractice.feature.refrigerator.api.dto

import com.example.kotlinPractice.domain.entity.Refrigerator
import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientInfoDto

data class RefrigeratorInfoDto(

    val id: Long?,
    val name: String,
    val ingredients: List<IngredientInfoDto>,

) {
    companion object {
        fun of(refrigerator: Refrigerator): RefrigeratorInfoDto {
            return RefrigeratorInfoDto(
                id = refrigerator.id,
                name = refrigerator.name,
                ingredients = refrigerator.ingredients.map { ingredient -> IngredientInfoDto.of(ingredient) }
            )
        }
    }
}
