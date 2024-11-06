package com.example.kotlinPractice.feature.menu.controller

import com.example.kotlinPractice.feature.media.MenuFacade
import com.example.kotlinPractice.feature.menu.api.dto.MenuCreateClientDto
import com.example.kotlinPractice.feature.menu.api.dto.MenuInfoDto
import com.example.kotlinPractice.feature.menu.api.dto.MenuUpdateDto
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/v1/menu")
class MenuController(
    private val menuFacade: MenuFacade,

) {
    @PostMapping("")
    fun createMenu(
        @RequestBody menuCreateClientDto: MenuCreateClientDto,
        @RequestParam("files") menuImages: List<MultipartFile>,
    ): MenuInfoDto {
        return menuFacade.createMenu(menuCreateClientDto, menuImages)
    }

    @PatchMapping("")
    fun updateMenu(
        @RequestBody menuUpdateDto: MenuUpdateDto,
        @RequestParam("files") newMenuImages: List<MultipartFile>,
    ): MenuInfoDto {
        return menuFacade.updateMenu(menuUpdateDto, newMenuImages)
    }

    @PatchMapping("/{menu-id}")
    fun deleteMenu(
        @PathVariable("menu-id") menuId: Long,
    ) {
        return menuFacade.deleteMenu(menuId)
    }
}
