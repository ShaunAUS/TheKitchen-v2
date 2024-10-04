package com.example.kotlinPractice.feature.kitchen.api

import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto
import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto
import com.example.kotlinPractice.domain.entity.Kitchen
import com.example.kotlinPractice.domain.repository.KitchenRepository
import org.springframework.stereotype.Service

@Service
class KitchenServiceImpl(
        private val kitchenRepository: KitchenRepository,
) : KitchenService {
    override fun createKitchen(createKitchenDto: KitchenCreateDto): KitchenInfoDto {
        val savedKitchen = kitchenRepository.save(Kitchen.of(createKitchenDto))
        return KitchenInfoDto.of(savedKitchen)
    }
}