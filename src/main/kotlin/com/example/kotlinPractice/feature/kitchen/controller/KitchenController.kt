package com.example.kotlinPractice.feature.kitchen.controller

import com.example.kotlinPractice.feature.kitchen.api.KitchenService
import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto
import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/kitchen")
class KitchenController(

    private val kitchenService: KitchenService,
) {

    @PostMapping("")
    fun createKitchen(
        @RequestBody createKitchenDto: KitchenCreateDto,
    ): KitchenInfoDto {
        return kitchenService.createKitchen(createKitchenDto)
    }
}
