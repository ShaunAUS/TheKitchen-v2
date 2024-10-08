package com.example.kotlinPractice.feature.prep.api.dto

import com.example.kotlinPractice.domain.enums.ExecutionType

data class PrepUpdateDto(
    val prepId: Long,
    val executionType: ExecutionType,
)
