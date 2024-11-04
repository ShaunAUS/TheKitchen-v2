package com.example.kotlinPractice.feature.member.api.dto

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.enums.LevelType
import com.example.kotlinPractice.domain.enums.SectionType
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto

data class MemberWithPrepInfoDto(
    val name: String,
    val level: LevelType,
    val section: SectionType,
    val experience: Int?,
    val preps: List<PrepInfoDto>,
) {
    companion object {
        fun of(member: Member): MemberWithPrepInfoDto {
            return MemberWithPrepInfoDto(
                name = member.name,
                level = LevelType.toType(member.level),
                section = SectionType.toType(member.section),
                experience = member.experience,
                preps = member.preps.map { p -> PrepInfoDto.of(p) },
            )
        }
    }
}
