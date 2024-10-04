package com.example.kotlinPractice.feature.member.api

import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface MemberService {
    fun createMember(memberCreateDto: MemberCreateDto, kitchenId: Long): MemberInfoDto
    fun getMembers(pageable: Pageable): Page<MemberInfoDto>
    fun updateMember(targetMemberId: Long, updateDto: MemberUpdateDto): MemberInfoDto
    fun removeMember(targetMemberId: Long)
    fun getMember(targetMemberId: Long): MemberInfoDto
}