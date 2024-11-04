package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.domain.enums.EnoughType
import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientCreateDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDate

@Entity
class Ingredient(

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val buyDate: LocalDate,

    @Column(nullable = false)
    val expireDate: LocalDate,

    @Column(nullable = false)
    var expirationPeriod: Int,

    @Column(nullable = false)
    var quantity: Int,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refrigerator_id")
    var refrigerator: Refrigerator,

) : BaseEntity() {

    fun updateIngredientQuantity(newIngredientQuantity: Int) {
        this.quantity = newIngredientQuantity
    }

    fun addIngredientQuantity(quantity: Int) {
        this.quantity += quantity
    }

    // FIXME 지금은 개수로만 체크
    fun isEnoughQuantity(): EnoughType {
        if (this.quantity < 2) {
            return EnoughType.NOTENOUGH
        }
        return EnoughType.ENOUGH
    }

    companion object {
        fun of(ingredientCreateDto: IngredientCreateDto, refrigerator: Refrigerator): Ingredient {
            return Ingredient(
                name = ingredientCreateDto.name,
                buyDate = ingredientCreateDto.buyDate,
                expireDate = ingredientCreateDto.expireDate,
                expirationPeriod = ingredientCreateDto.expirationPeriod,
                quantity = ingredientCreateDto.quantity,
                refrigerator = refrigerator,
            )
        }
    }
}
