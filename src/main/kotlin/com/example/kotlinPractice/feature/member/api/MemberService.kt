package com.example.kotlinPractice.feature.member.api

import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberPrepInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface MemberService {
    fun createMember(memberCreateDto: MemberCreateDto): MemberInfoDto
    fun getMembers(pageable: Pageable): Page<MemberInfoDto>
    fun updateMember(updateDto: MemberUpdateDto): MemberInfoDto
    fun removeMember(targetMemberId: Long)
    fun getMember(targetMemberId: Long): MemberInfoDto
    fun getPrepBy(targetMemberUniqueId: Long): MemberPrepInfoDto
}
