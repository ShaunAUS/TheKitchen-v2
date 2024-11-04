package com.example.kotlinPractice.feature.prep.api.dto

import com.example.kotlinPractice.domain.enums.ExecutionType
import java.time.LocalDate

data class PrepCreateDto(
    val job: String,
    val priority: Int,
    val executionType: ExecutionType,
    val deadLine: LocalDate,
)
