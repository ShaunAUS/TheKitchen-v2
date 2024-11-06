package com.example.kotlinPractice.feature.refrigerator.controller

import com.example.kotlinPractice.feature.refrigerator.api.RefrigeratorService
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientEnoughQuantityDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/refrigerators")
class RefrigeratorController(
    private val refrigeratorService: RefrigeratorService,
) {
    @PostMapping("")
    fun createRefrigerator(
        @RequestBody refrigeratorCreateDto: RefrigeratorCreateDto,
    ): RefrigeratorInfoDto {
        return refrigeratorService.createRefrigerator(refrigeratorCreateDto)
    }

    @GetMapping("/{refrigeratorId}")
    fun getRefrigeratorStatus(
        @PathVariable refrigeratorId: Long,
    ): RefrigeratorInfoDto {
        return refrigeratorService.getRefrigerator(refrigeratorId)
    }

    @PatchMapping("/{refrigeratorId}")
    fun removeRefrigerator(
        @PathVariable refrigeratorId: Long,
    ) {
        refrigeratorService.remove(refrigeratorId)
    }

    @GetMapping("/{refrigeratorId}/check/ingredient")
    fun checkNotEnoughIngredientFromRefrigerator(
        @PathVariable refrigeratorId: Long,
    ): List<IngredientEnoughQuantityDto> {
        return refrigeratorService.checkNotEnoughIngredientFromRefrigerator(refrigeratorId)
    }
}
