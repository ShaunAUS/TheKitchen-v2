package com.example.kotlinPractice.feature.ingredient.controller

import com.example.kotlinPractice.feature.ingredient.api.IngredientService
import com.example.kotlinPractice.feature.ingredient.api.dto.CreateIngredientDto
import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientUpdateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientInfoDto
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/ingredient")
class IngredientController(

    private val ingredientService: IngredientService,
) {

    @PostMapping("")
    fun addIngredientToRefrigerator(
        @RequestBody createIngredientDto: CreateIngredientDto,
    ): IngredientInfoDto {
        return ingredientService.addIngredient(createIngredientDto)
    }

    @PatchMapping("")
    fun updateIngredient(
        @RequestBody ingredientUpdateDto: IngredientUpdateDto,
    ): IngredientInfoDto {
        return ingredientService.updateIngredientQuantity(ingredientUpdateDto)
    }
}
