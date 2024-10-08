package com.example.kotlinPractice.domain.repository

import com.example.kotlinPractice.domain.entity.Prep
import com.example.kotlinPractice.domain.repository.querydsl.PrepRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface PrepRepository : JpaRepository<Prep, Long>, PrepRepositoryCustom
