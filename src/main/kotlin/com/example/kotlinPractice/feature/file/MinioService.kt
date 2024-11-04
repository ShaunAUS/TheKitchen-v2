package com.example.kotlinPractice.feature.file

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.entity.Menu
import org.springframework.web.multipart.MultipartFile

interface MinioService {
    fun uploadMenuImages(menuImage: MultipartFile, savedMenu: Menu, imageRandomName: String)
    fun downloadImages(bucketName: String, objectName: String): ByteArray
    fun deleteMenuImages(oldImages: List<Image>)
    fun getImageUrl(imageRandomName: String): String
}
