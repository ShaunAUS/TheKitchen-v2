package com.example.kotlinPractice.feature.member.api.dto

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.enums.LevelType
import com.example.kotlinPractice.domain.enums.SectionType

data class MemberInfoDto(
    val name: String,
    val level: LevelType,
    val section: SectionType,
    val experience: Int,
    val uniqueId: String,
) {

    companion object {
        fun of(member: Member): MemberInfoDto {
            return MemberInfoDto(
                name = member.name,
                level = LevelType.toType(member.level),
                section = SectionType.toType(member.section),
                experience = member.experience,
                uniqueId = member.uniqueId,
            )
        }
    }
}
