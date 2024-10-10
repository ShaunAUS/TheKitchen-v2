package com.example.kotlinPractice.feature.refrigerator.controller

import com.example.kotlinPractice.feature.refrigerator.api.RefrigeratorService
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientInfoDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/refrigerator")
class RefrigeratorController(
    private val refrigeratorService: RefrigeratorService
) {
    @PostMapping("")
    fun createRefrigerator(
        @RequestBody refrigeratorCreateDto: RefrigeratorCreateDto,
        @RequestParam("kitchenId") kitchenId: Long,
    ): IngredientInfoDto {
        return refrigeratorService.createRefrigerator(refrigeratorCreateDto, kitchenId)
    }

    @PatchMapping("/uptodate")
    fun updateRefrigerator(
        @RequestParam("refrigeratorId") refrigeratorId: Long,
    ): IngredientInfoDto {
        return refrigeratorService.updateRefrigerator(refrigeratorId)
    }

    @GetMapping("/{refrigeratorId}")
    fun getRefrigeratorStatus(
        @PathVariable refrigeratorId: Long,
    ): IngredientInfoDto {
        return refrigeratorService.getRefrigerator(refrigeratorId)
    }

    @DeleteMapping("/{refrigeratorId}")
    fun removeRefrigerator(
        @PathVariable refrigeratorId: Long,
    ) {
        refrigeratorService.remove(refrigeratorId)
    }
}
