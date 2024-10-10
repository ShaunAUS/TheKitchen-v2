package com.example.kotlinPractice.feature.refrigerator.api

import com.example.kotlinPractice.domain.entity.Kitchen
import com.example.kotlinPractice.domain.entity.Refrigerator
import com.example.kotlinPractice.domain.repository.KitchenRepository
import com.example.kotlinPractice.domain.repository.RefrigeratorRepository
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientInfoDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import com.group.libraryapp.utils.findByIdOrThrow
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.Duration

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
        refrigeratorRepository.deleteById(refrigeratorId)
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

    @Transactional
    private fun upToDateIngredientDate(refrigerator: Refrigerator) {
        refrigerator.ingredients
            .stream()
            .forEach { ingredient ->
                ingredient.updateExpirationPeriod(
                    Duration.between(ingredient.buyDate.atStartOfDay(), ingredient.expireDate.atStartOfDay()).toDays(),
                )
            }
    }
}
