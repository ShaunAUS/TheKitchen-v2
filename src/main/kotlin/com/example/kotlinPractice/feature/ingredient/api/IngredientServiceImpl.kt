package com.example.kotlinPractice.feature.ingredient.api

import com.example.kotlinPractice.domain.entity.Ingredient
import com.example.kotlinPractice.domain.entity.Kitchen
import com.example.kotlinPractice.domain.entity.Refrigerator
import com.example.kotlinPractice.domain.repository.IngredientRepository
import com.example.kotlinPractice.domain.repository.KitchenRepository
import com.example.kotlinPractice.domain.repository.RefrigeratorRepository
import com.example.kotlinPractice.feature.ingredient.api.dto.CreateIngredientDto
import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientUpdateDto
import com.example.kotlinPractice.feature.refrigerator.api.dto.IngredientInfoDto
import com.example.kotlinPractice.global.utils.empty
import com.example.kotlinPractice.global.utils.findByIdOrThrow
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Slf4j
class IngredientServiceImpl(

    private val refrigeratorRepository: RefrigeratorRepository,
    private val ingredientRepository: IngredientRepository,
    private val kitchenRepository: KitchenRepository,

) : IngredientService {

    @Transactional
    override fun updateIngredientQuantity(ingredientUpdateDto: IngredientUpdateDto): IngredientInfoDto {
        val refrigeratorId = ingredientUpdateDto.refrigeratorId
        val refrigerator = findRefrigeratorOrThrow(refrigeratorId)

        for (newIngredient in ingredientUpdateDto.ingredientUpdateDtos) {
            val oldIngredient = ingredientRepository.findByNameWithRefrigeratorId(newIngredient.name, refrigeratorId) ?: empty()
            oldIngredient.updateIngredientQuantity(newIngredient.quantity)
        }
        return IngredientInfoDto.of(refrigerator)
    }

    @Transactional
    override fun addIngredient(createIngredientDto: CreateIngredientDto): IngredientInfoDto {
        // 주방 ,냉장고 있나 확인
        findKitchenOrThrow(createIngredientDto.kitchenId)
        val refrigerator = findRefrigeratorOrThrow(createIngredientDto.refrigeratorId)
        addIngredientToRefrigerator(createIngredientDto, refrigerator)
        return IngredientInfoDto.of(refrigerator)
    }

    // TODO 중간에 들어온 재료 날짜다르게 로직 필요 , 지금은 그냥 더하기
    private fun addIngredientToRefrigerator(createIngredientDto: CreateIngredientDto, refrigerator: Refrigerator) {
        createIngredientDto.ingredientCreateDtos
            .forEach { ingredientDto ->
                ingredientRepository.findByName(ingredientDto.name)?.addIngredientQuantity(ingredientDto.quantity)
                    ?: ingredientRepository.save(Ingredient.of(ingredientDto, refrigerator))
            }
    }

    private fun findKitchenOrThrow(kitchenId: Long): Kitchen {
        return kitchenRepository.findByIdOrThrow(kitchenId)
    }

    private fun findRefrigeratorOrThrow(refrigeratorId: Long): Refrigerator {
        return refrigeratorRepository.findByIdOrThrow(refrigeratorId)
    }
}
