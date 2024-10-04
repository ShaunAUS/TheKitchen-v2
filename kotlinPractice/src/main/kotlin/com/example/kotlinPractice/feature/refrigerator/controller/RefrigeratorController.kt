package com.example.kotlinPractice.feature.refrigerator.controller

import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto
import com.example.kotlinPractice.feature.refrigerator.api.RefrigeratorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/refrigerator")
class RefrigeratorController(
        private val refrigeratorService: RefrigeratorService
) {
    @PostMapping("")
    fun createRefrigerator(
            @RequestBody refrigeratorCreateDto: RefrigeratorCreateDto,
            @RequestParam("kitchenId") kitchenId: Long,
    ): RefrigeratorInfoDto {
        return refrigeratorService.createRefrigerator(refrigeratorCreateDto,kitchenId)
    }

    @PatchMapping("/uptodate")
    fun updateRefrigerator(
            @RequestParam("refrigeratorId") refrigeratorId: Long,
    ): RefrigeratorInfoDto {
        return refrigeratorService.updateRefrigerator(refrigeratorId)
    }

    @GetMapping("/{refrigeratorId}")
    fun getRefrigeratorStatus(
            @PathVariable refrigeratorId: Long,
    ): RefrigeratorInfoDto {
        return refrigeratorService.getRefrigerator(refrigeratorId)
    }

    @DeleteMapping("/{refrigeratorId}")
    fun removeRefrigerator(
            @PathVariable refrigeratorId: Long,
    ){
        refrigeratorService.remove(refrigeratorId)
    }

}