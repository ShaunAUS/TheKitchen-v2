package com.example.kotlinPractice.feature.menu.api

import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.feature.menu.api.dto.MenuCreateClientDto

interface MenuService {
    fun createMenu(menuCreateClientDto: MenuCreateClientDto): Menu
    fun findBy(menuId: Long): Menu
}
