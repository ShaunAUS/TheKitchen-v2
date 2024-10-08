package com.example.kotlinPractice.feature.prep.api

import com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto

interface PrepService {
    fun createPrepToTargetMember(targetMemberId: Long, prepCreateDtos: List<PrepCreateDto>): MemberWithPrepInfoDto
    fun updatePrepStatus(prepId: Long): PrepInfoDto
    fun getMyPrep(targetMemberId: Long): List<PrepInfoDto>
}
