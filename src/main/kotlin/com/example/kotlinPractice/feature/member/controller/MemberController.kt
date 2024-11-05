package com.example.kotlinPractice.feature.member.controller

import com.example.kotlinPractice.feature.member.api.MemberService
import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberPrepInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/members")
class MemberController(

    private val memberService: MemberService,
) {

    @PostMapping("")
    fun createMember(
        @RequestBody memberCreateDto: MemberCreateDto,
    ): MemberInfoDto {
        return memberService.createMember(memberCreateDto)
    }

    @GetMapping("/all")
    fun getMembers(
        @PageableDefault(size = 10, sort = ["id"], direction = Sort.Direction.DESC) pageable: Pageable,
    ): Page<MemberInfoDto> {
        return memberService.getMembers(pageable)
    }

    @GetMapping("/{targetMemberUniqueId}")
    fun getMember(
        @PathVariable targetMemberUniqueId: Long,
    ): MemberInfoDto {
        return memberService.getMember(targetMemberUniqueId)
    }

    @PatchMapping("")
    fun updateMember(
        @RequestBody updateDto: MemberUpdateDto,
    ): MemberInfoDto {
        return memberService.updateMember(updateDto)
    }

    @PatchMapping("/{targetMemberUniqueId}")
    fun removeMember(
        @PathVariable targetMemberUniqueId: Long,
    ) {
        return memberService.removeMember(targetMemberUniqueId)
    }

    @GetMapping("{targetMemberUniqueId}/prep")
    fun checkMyPrep(
        @PathVariable targetMemberUniqueId: Long,
    ): MemberPrepInfoDto {
        return memberService.getPrepBy(targetMemberUniqueId)
    }
}
