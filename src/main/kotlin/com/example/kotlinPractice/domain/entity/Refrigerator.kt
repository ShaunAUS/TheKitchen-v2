package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Refrigerator(
    name: String,
    kitchen: Kitchen,
) : BaseEntity() {

    @Column(nullable = false)
    var name: String = name
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitchen_id")
    var kitchen: Kitchen = kitchen
        protected set

    @OneToMany(mappedBy = "refrigerator", cascade = [CascadeType.ALL], orphanRemoval = true)
    protected val _ingredients: MutableList<Ingredient> = mutableListOf()
    val ingredients: List<Ingredient> get() = _ingredients.toList()

    fun addIngredient(ingredient: Ingredient) {
        _ingredients.add(ingredient)
    }

    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(refrigeratorCreateDto: RefrigeratorCreateDto, kitchen: Kitchen): Refrigerator {
            return Refrigerator(
                name = refrigeratorCreateDto.name,
                kitchen = kitchen,
            )
        }
    }
}
