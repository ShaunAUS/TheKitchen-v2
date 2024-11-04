package com.example.kotlinPractice.feature.member.api.dto

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto

data class MemberPrepInfoDto(
    val name: String,
    val uniqueId: String,
    val preps: List<PrepInfoDto>,

) {
    companion object {
        fun of(memberWithPreps: Member): MemberPrepInfoDto {
            return MemberPrepInfoDto(
                name = memberWithPreps.name,
                uniqueId = memberWithPreps.uniqueId,
                preps = memberWithPreps.preps.map { prep -> PrepInfoDto.of(prep) },
            )
        }
    }
}
