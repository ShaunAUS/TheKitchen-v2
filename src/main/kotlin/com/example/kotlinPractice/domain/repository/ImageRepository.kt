package com.example.kotlinPractice.domain.repository

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.repository.querydsl.ImageRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface ImageRepository : JpaRepository<Image, Long>, ImageRepositoryCustom
