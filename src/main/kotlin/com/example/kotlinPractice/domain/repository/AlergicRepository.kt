package com.example.kotlinPractice.domain.repository

import com.example.kotlinPractice.domain.entity.Alergic
import com.example.kotlinPractice.domain.repository.querydsl.AlergicRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface AlergicRepository : JpaRepository<Alergic, Long>, AlergicRepositoryCustom
