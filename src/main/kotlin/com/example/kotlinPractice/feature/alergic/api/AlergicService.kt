package com.example.kotlinPractice.feature.alergic.api

import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.domain.enums.AlergicType

interface AlergicService {
    fun createAlergic(alergicTypes: List<AlergicType>, savedMenu: Menu)
    fun updateAlergic(newAlergics: List<AlergicType>, updatedMenu: Menu)
    fun delete(menuId: Long)
}
