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
    name: String,
    buyDate: LocalDate,
    expireDate: LocalDate,
    expirationPeriod: Int,
    quantity: Int,
    refrigerator: Refrigerator,
) : BaseEntity() {

    @Column(nullable = false)
    var name: String = name
        protected set

    @Column(nullable = false)
    var buyDate: LocalDate = buyDate
        protected set

    @Column(nullable = false)
    var expireDate: LocalDate = expireDate
        protected set

    @Column(nullable = false)
    var expirationPeriod: Int = expirationPeriod
        protected set

    @Column(nullable = false)
    var quantity: Int = quantity
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refrigerator_id")
    var refrigerator: Refrigerator = refrigerator
        protected set

    fun updateIngredientQuantity(newIngredientQuantity: Int) {
        this.quantity = newIngredientQuantity
    }

    fun addIngredientQuantity(quantity: Int) {
        this.quantity += quantity
    }

    fun isEnoughQuantity(): EnoughType {
        return if (this.quantity < 2) EnoughType.NOTENOUGH else EnoughType.ENOUGH
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
