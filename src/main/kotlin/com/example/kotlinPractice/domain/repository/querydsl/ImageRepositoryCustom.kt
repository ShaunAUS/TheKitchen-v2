package com.example.kotlinPractice.domain.repository.querydsl

import com.example.kotlinPractice.domain.entity.Image

interface ImageRepositoryCustom {
    fun findByMenuId(menuId: Long?): List<Image>?
}
