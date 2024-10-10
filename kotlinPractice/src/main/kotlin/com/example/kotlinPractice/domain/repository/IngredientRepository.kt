package com.example.kotlinPractice.domain.repository

import com.example.kotlinPractice.domain.entity.Ingredient
import com.example.kotlinPractice.domain.repository.querydsl.IngredientRepositoryCustom
import org.springframework.data.jpa.repository.JpaRepository

interface IngredientRepository : JpaRepository<Ingredient, Long>, IngredientRepositoryCustom
