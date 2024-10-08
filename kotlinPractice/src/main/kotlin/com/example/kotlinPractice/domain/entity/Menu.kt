package com.example.kotlinPractice.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Menu(

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val price: Int,

    @Column(nullable = false)
    val alergicType: Int,

    @ManyToOne
    @JoinColumn(name = "kitchen_id")
    val kitchen: Kitchen,

) : BaseEntity()
