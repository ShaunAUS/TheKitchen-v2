package com.example.kotlinPractice.feature.menu.api

import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.domain.repository.MenuRepository
import com.example.kotlinPractice.feature.menu.api.dto.MenuCreateClientDto
import com.example.kotlinPractice.global.error.ErrorCode
import com.example.kotlinPractice.global.error.exception.BusinessException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MenuServiceImpl(
    private val menuRepository: MenuRepository,
) : MenuService {

    @Transactional
    override fun createMenu(menuCreateClientDto: MenuCreateClientDto): Menu {
        return menuRepository.save(Menu.of(menuCreateClientDto))
    }

    override fun findBy(menuId: Long): Menu {
        return menuRepository.findById(menuId).orElseThrow { BusinessException(ErrorCode.NOT_FOUND_MENU) }
    }
}
