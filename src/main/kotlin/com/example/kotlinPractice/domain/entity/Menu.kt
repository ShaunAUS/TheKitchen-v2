package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.menu.api.dto.MenuCreateClientDto
import com.example.kotlinPractice.feature.menu.api.dto.MenuUpdateDto
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany

@Entity
class Menu(

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var price: Int,

    @Column(nullable = true)
    var procedure: String,

    @OneToMany(mappedBy = "menu", cascade = [CascadeType.ALL], orphanRemoval = true)
    val alergicTypes: MutableList<Alergic> = mutableListOf(),

    @OneToMany(mappedBy = "menu", cascade = [CascadeType.ALL], orphanRemoval = true)
    val images: MutableList<Image> = mutableListOf(),

    @Column(nullable = false)
    val kitchenId: Int,

) : BaseEntity() {
    fun update(menuUpdateDto: MenuUpdateDto): Menu {
        this.name = menuUpdateDto.name
        this.price = menuUpdateDto.price
        this.procedure = menuUpdateDto.procedure
        return this
    }

    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(menuCreateClientDto: MenuCreateClientDto): Menu {
            return Menu(
                name = menuCreateClientDto.menuCreateDto.name,
                price = menuCreateClientDto.menuCreateDto.price,
                procedure = menuCreateClientDto.menuCreateDto.procedure,
                kitchenId = menuCreateClientDto.kitchenId,
            )
        }
    }
}
