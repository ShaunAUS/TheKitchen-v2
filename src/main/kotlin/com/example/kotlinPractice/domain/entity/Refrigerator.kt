package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.refrigerator.api.dto.RefrigeratorCreateDto
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Refrigerator(

    val name: String,

    @ManyToOne
    @JoinColumn(name = "kitchen_id")
    var kitchen: Kitchen,

    @OneToMany(mappedBy = "refrigerator", orphanRemoval = true)
    val ingredients: List<Ingredient>,

) : BaseEntity() {
    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(refrigeratorCreateDto: RefrigeratorCreateDto, kitchen: Kitchen): Refrigerator {
            return Refrigerator(
                name = refrigeratorCreateDto.name,
                kitchen = kitchen,
                ingredients = emptyList(),
            )
        }
    }
}
