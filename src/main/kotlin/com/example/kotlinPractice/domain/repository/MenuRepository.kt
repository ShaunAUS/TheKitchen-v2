package com.example.kotlinPractice.domain.repository

import com.example.kotlinPractice.domain.entity.Menu
import com.example.kotlinPractice.domain.repository.querydsl.MenuRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface MenuRepository : JpaRepository<Menu, Long>, MenuRepositoryCustom
