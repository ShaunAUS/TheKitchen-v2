package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.domain.enums.AlergicType
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ForeignKey
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Alergic(
    val type: Int,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", foreignKey = ForeignKey(name = "fk_alergic_menu"))
    val menu: Menu,

) : BaseEntity() {
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
