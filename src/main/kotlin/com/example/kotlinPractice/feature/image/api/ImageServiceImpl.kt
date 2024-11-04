package com.example.kotlinPractice.feature.image.api

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.domain.repository.ImageRepository
import com.example.kotlinPractice.global.error.ErrorCode
import com.example.kotlinPractice.global.error.exception.BusinessException
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ImageServiceImpl(
    private val imageRepository: ImageRepository,
) : ImageService {

    override fun createImage(randomImageName: String, imageUrl: String, savedMenu: Menu) {
        saveImageInfo(randomImageName, imageUrl, savedMenu)
    }

    override fun updateImage(newMenuImages: List<MultipartFile>, updatedMenu: Menu) {
        TODO("Not yet implemented")
    }

    override fun findBy(menuId: Long): List<Image> {
        return imageRepository.findByMenuId(menuId) ?: throw BusinessException(ErrorCode.NOT_FOUND_MENU)
    }

    override fun deleteMenuImages(oldImages: List<Image>) {
        imageRepository.deleteAll(oldImages)
    }

    private fun saveImageInfo(randomImageName: String, imageUrl: String, savedMenu: Menu) {
        imageRepository.save(Image.of(randomImageName, imageUrl, savedMenu))
    }
}
