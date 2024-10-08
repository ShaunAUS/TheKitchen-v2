package com.example.kotlinPractice.feature.kitchen.api

import com.example.kotlinPractice.domain.entity.Kitchen
import com.example.kotlinPractice.domain.repository.KitchenRepository
import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto
import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenInfoDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class KitchenServiceImpl(
    private val kitchenRepository: KitchenRepository,
) : KitchenService {

    @Transactional
    override fun createKitchen(kitchenCreateDto: KitchenCreateDto): KitchenInfoDto {
        val savedKitchen = kitchenRepository.save(Kitchen.of(kitchenCreateDto))
        return KitchenInfoDto.of(savedKitchen)
    }
}
