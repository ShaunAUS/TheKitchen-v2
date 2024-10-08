package com.example.kotlinPractice.feature.prep.controller

import com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto
import com.example.kotlinPractice.feature.prep.api.PrepService
import com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/prep")
class PrepController(
    private val prepService: PrepService
) {

    // 다른 멤버에게  프렙리스트를 주는 형식
    @PostMapping("")
    fun makePrep(
        @RequestParam targetMemberId: Long,
        @RequestBody prepCreateDtos: List<PrepCreateDto>
    ): MemberWithPrepInfoDto {
        return prepService.createPrepToTargetMember(targetMemberId, prepCreateDtos)
    }

    @PatchMapping("/{prepId}")
    fun finishPrep(
        @PathVariable prepId: Long
    ): PrepInfoDto {
        return prepService.updatePrepStatus(prepId)
    }

    @GetMapping("/my")
    fun checkMyPrep(
        @RequestParam targetMemberId: Long,
    ): List<PrepInfoDto> {
        return prepService.getMyPrep(targetMemberId)
    }
}
