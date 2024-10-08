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
    val prepList: List<PrepInfoDto>
) {
    companion object {
        fun of(member: Member): MemberWithPrepInfoDto {
            return MemberWithPrepInfoDto(
                name = member.name,
                level = LevelType.intToType(member.level),
                section = SectionType.intToType(member.section),
                experience = member.experience,
                prepList = member.preps.map { p -> PrepInfoDto.of(p) }
            )
        }
    }
}
