package com.example.kotlinPractice.feature.prep.controller

import com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto
import com.example.kotlinPractice.feature.prep.api.PrepService
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepListCreateDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepUpdateDto
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/prep")
class PrepController(
    private val prepService: PrepService,
) {

    // 다른 멤버에게  프렙리스트를 주는 형식
    @PostMapping("")
    fun makePrep(
        @RequestBody prepListCreateDtos: PrepListCreateDto,
    ): MemberWithPrepInfoDto {
        return prepService.createPrepToTargetMember(prepListCreateDtos)
    }

    @PatchMapping("")
    fun finishPrep(
        @RequestBody prepUpdateDto: PrepUpdateDto,
    ): PrepInfoDto {
        return prepService.updatePrepStatus(prepUpdateDto)
    }
}
