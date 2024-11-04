package com.example.kotlinPractice.feature.media

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.feature.alergic.api.AlergicService
import com.example.kotlinPractice.feature.file.MinioService
import com.example.kotlinPractice.feature.image.api.ImageService
import com.example.kotlinPractice.feature.menu.api.MenuService
import com.example.kotlinPractice.feature.menu.api.dto.MenuCreateClientDto
import com.example.kotlinPractice.feature.menu.api.dto.MenuInfoDto
import com.example.kotlinPractice.feature.menu.api.dto.MenuUpdateDto
import com.example.kotlinPractice.global.utils.MediaUtils
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile

@Service
class MenuFacade(
    private val mediaUtils: MediaUtils,
    private val menuService: MenuService,
    private val minioService: MinioService,
    private val imageService: ImageService,
    private val alergicService: AlergicService,
) {

    // 1. 메뉴 , 2 minio , 3 Image, 4 Alergic
    @Transactional
    fun createMenu(menuCreateClientDto: MenuCreateClientDto, menuImages: List<MultipartFile>): MenuInfoDto {
        val savedMenu = menuService.createMenu(menuCreateClientDto)

        for (menuImage in menuImages) {
            val randomImageName = createRandomeImageName(menuImage)
            uploadMenuImageToMinio(menuImage, savedMenu, randomImageName)
            createImageInfo(randomImageName, createImageUrl(randomImageName), savedMenu)
        }
        saveAlergicType(menuCreateClientDto, savedMenu)
        return MenuInfoDto.of(savedMenu)
    }

    // 지금은 hard delete
    @Transactional
    fun updateMenu(menuUpdateDto: MenuUpdateDto, newMenuImages: List<MultipartFile>): MenuInfoDto {
        val updatedMenu = updateMenu(menuUpdateDto)

        deleteOldImagesBy(menuUpdateDto.menuId)

        // upload New images
        for (newMenuImage in newMenuImages) {
            val randomImageName = createRandomeImageName(newMenuImage)
            uploadMenuImageToMinio(newMenuImage, updatedMenu, randomImageName)
            createImageInfo(randomImageName, createImageUrl(randomImageName), updatedMenu)
        }

        alergicService.updateAlergic(menuUpdateDto.alergicType, updatedMenu)
        return MenuInfoDto.of(updatedMenu)
    }

    // 지금은 hard delete
    @Transactional
    fun deleteMenu(menuId: Long) {
        deleteMenuBy(menuId)
        deleteOldImagesBy(menuId)
        alergicService.delete(menuId)
    }

    private fun deleteMenuBy(menuId: Long) {
        menuService.findBy(menuId).delete()
    }

    private fun saveAlergicType(menuCreateClientDto: MenuCreateClientDto, savedMenu: Menu) {
        alergicService.createAlergic(menuCreateClientDto.menuCreateDto.alergicTypes, savedMenu)
    }

    private fun createImageInfo(randomImageName: String, imageUrl: String, savedMenu: Menu) {
        imageService.createImage(randomImageName, imageUrl, savedMenu)
    }

    private fun uploadMenuImageToMinio(menuImage: MultipartFile, savedMenu: Menu, randomImageName: String) {
        minioService.uploadMenuImages(menuImage, savedMenu, randomImageName)
    }

    private fun createRandomeImageName(menuImage: MultipartFile): String {
        val randomImageName = mediaUtils.makeRandomImageNameBy(menuImage)
        return randomImageName
    }

    private fun createImageUrl(randomImageName: String): String {
        return minioService.getImageUrl(randomImageName)
    }

    private fun updateMenu(menuUpdateDto: MenuUpdateDto): Menu {
        val oldMenu = menuService.findBy(menuUpdateDto.menuId)
        return oldMenu.update(menuUpdateDto)
    }

    private fun deleteOldImagesBy(menuId: Long): List<Image> {
        val oldImages = imageService.findBy(menuId)
        minioService.deleteMenuImages(oldImages)
        imageService.deleteMenuImages(oldImages)
        return oldImages
    }
}
