package com.example.kotlinPractice.feature.refrigerator.api

import com.example.kotlinPractice.domain.entity.Ingredient
import com.example.kotlinPractice.domain.entity.Kitchen
import com.example.kotlinPractice.domain.entity.Refrigerator
import com.example.kotlinPractice.domain.repository.KitchenRepository
import com.example.kotlinPractice.domain.repository.RefrigeratorRepository
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientEnoughQuantityDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorInfoDto
import com.example.kotlinPractice.global.utils.findByIdOrThrow
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Service
@Slf4j
class RefrigeratorServiceImpl(
    private val refrigeratorRepository: RefrigeratorRepository,
    private val kitchenRepository: KitchenRepository,
) : RefrigeratorService {

    override fun getRefrigerator(refrigeratorId: Long): RefrigeratorInfoDto {
        return RefrigeratorInfoDto.of(findRefrigeratorOrThrow(refrigeratorId))
    }

    override fun remove(refrigeratorId: Long) {
        val refrigeratorById = refrigeratorRepository.findByIdOrThrow(refrigeratorId)
        refrigeratorById.delete()
    }

    override fun createRefrigerator(refrigeratorCreateDto: RefrigeratorCreateDto): RefrigeratorInfoDto {
        return RefrigeratorInfoDto.of(refrigeratorRepository.save(createRefrigeratorBy(refrigeratorCreateDto)))
    }

    override fun checkNotEnoughIngredientFromRefrigerator(refrigeratorId: Long): List<IngredientEnoughQuantityDto> {
        return findIngredientsFromRefrigerator(refrigeratorId)
            .stream()
            .map { ingredient -> IngredientEnoughQuantityDto.of(ingredient) }
            .toList()
    }

    private fun findKitchenOrThrow(kitchenId: Long): Kitchen {
        return kitchenRepository.findByIdOrThrow(kitchenId)
    }

    private fun findRefrigeratorOrThrow(refrigeratorId: Long): Refrigerator {
        return refrigeratorRepository.findByIdOrThrow(refrigeratorId)
    }

    private fun findIngredientsFromRefrigerator(refrigeratorId: Long): List<Ingredient> {
        return findRefrigeratorOrThrow(refrigeratorId).ingredients
    }

    private fun createRefrigeratorBy(refrigeratorCreateDto: RefrigeratorCreateDto): Refrigerator {
        return Refrigerator.of(refrigeratorCreateDto, findKitchenOrThrow(refrigeratorCreateDto.kitchenId))
    }
}
