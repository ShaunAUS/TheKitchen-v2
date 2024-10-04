package com.example.kotlinPractice.feature.ingredient.controller

import com.example.kotlinPractice.feature.ingredient.api.dto.AddIngredientDto
import com.example.kotlinPractice.feature.ingredient.api.dto.UseIngredientDto
import com.example.kotlinPractice.domain.dto.refrigerator.RefrigeratorInfoDto
import com.example.kotlinPractice.feature.ingredient.api.IngredientService
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
    fun buyIngredient(
            @RequestBody addIngredientDto: AddIngredientDto,
    ): RefrigeratorInfoDto {

        return ingredientService.addIngredient(addIngredientDto)
    }

    @PatchMapping("")
    fun useIngredient(
            @RequestBody useIngredientDto: UseIngredientDto,
    ): RefrigeratorInfoDto {
        return ingredientService.useIngredient(useIngredientDto)
    }

}