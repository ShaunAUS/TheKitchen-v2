package com.example.kotlinPractice.domain.repository.querydsl

import com.example.kotlinPractice.domain.entity.Prep

interface PrepRepositoryCustom {
    fun findByMemberId(targetMemberId: Long): List<Prep>
}
