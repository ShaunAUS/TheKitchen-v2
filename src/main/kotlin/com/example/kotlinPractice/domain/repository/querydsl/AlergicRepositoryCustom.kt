package com.example.kotlinPractice.domain.repository.querydsl

import com.example.kotlinPractice.domain.entity.Alergic

interface AlergicRepositoryCustom {
    fun findByMenuId(menuId: Long?): List<Alergic>
}
