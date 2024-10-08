package com.example.kotlinPractice.feature.member.api

import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import com.group.libraryapp.utils.findByIdOrThrow
import lombok.extern.slf4j.Slf4j
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Slf4j
class MemberServiceImpl(

    private val memberRepository: MemberRepository,

) : MemberService {
    @Transactional
    override fun createMember(memberCreateDto: MemberCreateDto): MemberInfoDto {
        val member = Member.of(memberCreateDto)
        return MemberInfoDto.of(memberRepository.save(member))
    }

    @Transactional(readOnly = true)
    override fun getMember(targetMemberId: Long): MemberInfoDto {
        return MemberInfoDto.of(getMemberOrThrow(targetMemberId))
    }

    @Transactional(readOnly = true)
    override fun getMembers(pageable: Pageable): Page<MemberInfoDto> {
        return memberRepository.findAll(pageable)
                .map { member -> MemberInfoDto.of(member) }
    }

    @Transactional
    override fun updateMember(updateDto: MemberUpdateDto): MemberInfoDto {
        val targetMember = getMemberOrThrow(updateDto.targetMemberId)
        targetMember.update(updateDto)
        return MemberInfoDto.of(targetMember)
    }

    @Transactional
    override fun removeMember(targetMemberId: Long) {
        memberRepository.deleteById(targetMemberId)
    }

    private fun getMemberOrThrow(memberId: Long): Member {
        return memberRepository.findByIdOrThrow(memberId)
    }
}
