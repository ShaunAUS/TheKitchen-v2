package com.example.kotlinPractice.feature.image.api

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.entity.Menu
import org.springframework.web.multipart.MultipartFile

interface ImageService {
    fun createImage(randomImageName: String, imageUrl: String, savedMenu: Menu)
    fun updateImage(newMenuImages: List<MultipartFile>, updatedMenu: Menu)
    fun findBy(menuId: Long): List<Image>
    fun deleteMenuImages(oldImages: List<Image>)
}
