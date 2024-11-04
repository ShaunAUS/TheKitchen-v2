package com.example.kotlinPractice.feature.prep.api.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty

data class PrepListCreateDto(
    @field:NotEmpty(message = "준비물 목록은 비어있을 수 없습니다")
    val prepCreateDtos: List<PrepCreateDto>,

    @field:NotBlank(message = "대상 회원 ID는 필수입니다")
    val targetMemberUniqueId: String,
)
