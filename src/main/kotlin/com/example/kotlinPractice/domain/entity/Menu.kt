package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.feature.menu.api.dto.MenuCreateClientDto
import com.example.kotlinPractice.feature.menu.api.dto.MenuUpdateDto
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany

@Entity
class Menu(
    name: String,
    price: Int,
    cookingProcedure: String?,
    kitchenId: Long,
) : BaseEntity() {

    @Column(nullable = false)
    var name: String = name
        protected set

    @Column(nullable = false)
    var price: Int = price
        protected set

    @Column(nullable = true)
    var cookingProcedure: String? = cookingProcedure // 필드명 변경
        protected set

    @Column(nullable = false)
    var kitchenId: Long = kitchenId
        protected set

    @OneToMany(mappedBy = "menu", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val _alergicTypes: MutableList<Alergic> = mutableListOf()
    val alergicTypes: List<Alergic> get() = _alergicTypes.toList()

    @OneToMany(mappedBy = "menu", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val _images: MutableList<Image> = mutableListOf()
    val images: List<Image> get() = _images.toList()

    fun addAlergicType(alergic: Alergic) {
        _alergicTypes.add(alergic)
    }

    fun addImage(image: Image) {
        _images.add(image)
    }

    fun update(menuUpdateDto: MenuUpdateDto): Menu {
        this.name = menuUpdateDto.name
        this.price = menuUpdateDto.price
        this.cookingProcedure = menuUpdateDto.procedure
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
                cookingProcedure = menuCreateClientDto.menuCreateDto.procedure,
                kitchenId = menuCreateClientDto.kitchenId,
            )
        }
    }
}
