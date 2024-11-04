package com.example.kotlinPractice.domain.repository.querydsl.Impl

import com.example.kotlinPractice.domain.repository.querydsl.MenuRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory

class MenuRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,
) : MenuRepositoryCustom
