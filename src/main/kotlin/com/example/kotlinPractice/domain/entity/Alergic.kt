package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.domain.enums.AlergicType
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Alergic(
    type: Int,
    menu: Menu,
) : BaseEntity() {
    var type: Int = type
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    var menu: Menu = menu
        protected set

    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(alergicType: AlergicType, savedMenu: Menu): Alergic {
            return Alergic(
                type = AlergicType.toInt(alergicType),
                menu = savedMenu,
            )
        }
    }
}
