package com.example.kotlinPractice.feature.prep.api

import com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepListCreateDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepUpdateDto

interface PrepService {
    fun createPrepToTargetMember(prepListCreateDtos: PrepListCreateDto): MemberWithPrepInfoDto
    fun updatePrepStatus(prepUpdateDto: PrepUpdateDto): PrepInfoDto
}
