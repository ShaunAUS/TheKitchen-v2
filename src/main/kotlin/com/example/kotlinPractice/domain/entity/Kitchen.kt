package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.kitchen.api.dto.KitchenCreateDto
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany

@Entity
class Kitchen(
    name: String,
    location: String,
) : BaseEntity() {

    @Column(nullable = false)
    var name: String = name
        protected set

    @Column(nullable = false)
    var location: String = location
        protected set

    @OneToMany(mappedBy = "kitchen", cascade = [CascadeType.ALL], orphanRemoval = true)
    protected val _refrigerators: MutableList<Refrigerator> = mutableListOf()
    val refrigerators: List<Refrigerator> get() = _refrigerators.toList()

    fun addRefrigerator(refrigerator: Refrigerator) {
        _refrigerators.add(refrigerator)
    }
    companion object {
        fun of(createKitchenDto: KitchenCreateDto): Kitchen {
            return Kitchen(
                name = createKitchenDto.name,
                location = createKitchenDto.location,
            )
        }
    }
}
