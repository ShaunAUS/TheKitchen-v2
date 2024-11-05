package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Kitchen(

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val location: String,

) : BaseEntity() {
    companion object {
        fun of(createKitchenDto: KitchenCreateDto): Kitchen {
            return Kitchen(
                name = createKitchenDto.name,
                location = createKitchenDto.location,
            )
        }
    }
}
