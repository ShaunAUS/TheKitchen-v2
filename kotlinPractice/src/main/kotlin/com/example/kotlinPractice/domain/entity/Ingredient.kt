package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.ingredient.api.dto.IngredientCreateDto
import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Ingredient(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,

        @Column(nullable = false)
        val name: String,

        @Column(nullable = false)
        val buyDate: LocalDate,

        @Column(nullable = false)
        val expireDate: LocalDate,

        //TODO 항상최신화
        @Column(nullable = false)
        var expirationPeriod: Int,

        @Column(nullable = false)
        var quantity: Int,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "refrigerator_id")
        var refrigerator: Refrigerator,


        ) {

    fun updateIngredientQuantity(useQuantity: Int) {
        this.quantity -= useQuantity
    }

    fun addIngredientQuantity(quantity: Int) {
        this.quantity += quantity
    }

    fun updateExpirationPeriod(toDays: Long) {
        this.expirationPeriod = toDays.toInt()
    }


    companion object {
        fun of(ingredientCreateDto: IngredientCreateDto, refrigerator: Refrigerator): Ingredient {
            return Ingredient(
                    id = null,
                    name = ingredientCreateDto.name,
                    buyDate = ingredientCreateDto.buyDate,
                    expireDate = ingredientCreateDto.expireDate,
                    expirationPeriod = ingredientCreateDto.expirationPeriod,
                    quantity = ingredientCreateDto.quantity,
                    refrigerator = refrigerator
            )
        }
    }
}