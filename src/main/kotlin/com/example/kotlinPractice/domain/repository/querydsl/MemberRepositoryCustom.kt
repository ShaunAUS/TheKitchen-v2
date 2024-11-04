package com.example.kotlinPractice.domain.repository.querydsl

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.feature.member.api.dto.MemberPrepInfoDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface MemberRepositoryCustom {
    fun findMembers(page: Pageable): Page<Member>
    fun findBy(memberUniqueId: String): Member?
    fun findMemberWithPrepsBy(targetMemberUniqueId: Long): MemberPrepInfoDto
}
