package com.example.kotlinPractice.feature.member.api

import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberInfoDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import com.example.kotlinPractice.domain.entity.Kitchen
import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.repository.KitchenRepository
import com.example.kotlinPractice.domain.repository.MemberRepository
import com.example.kotlinPractice.domain.repository.PrepRepository
import com.example.kotlinPractice.feature.member.api.MemberService
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
        private val prepRepository: PrepRepository,
        private val kitchenRepository: KitchenRepository,

        ) : MemberService {
    override fun createMember(memberCreateDto: MemberCreateDto, kitchenId: Long): MemberInfoDto {
        val member = Member.of(memberCreateDto, getKitchenById(kitchenId))
        return MemberInfoDto.of(memberRepository.save(member))
    }


    override fun getMember(memberId: Long): MemberInfoDto {
        return MemberInfoDto.of(getMemberOrThrow(memberId))
    }

    override fun getMembers(pageable: Pageable): Page<MemberInfoDto> {
        return memberRepository.findAll(pageable)
                .map { member -> MemberInfoDto.of(member) }
    }

    @Transactional
    override fun updateMember(targetMemberId: Long, updateDto: MemberUpdateDto): MemberInfoDto {
        val targetMember = getMemberOrThrow(targetMemberId)

        targetMember.update(updateDto)
        return MemberInfoDto.of(targetMember)
    }

    override fun removeMember(targetMemberId: Long) {
        memberRepository.deleteById(targetMemberId)
    }

    private fun getMemberOrThrow(memberId: Long): Member {
        return memberRepository.findByIdOrThrow(memberId)
    }

    private fun getKitchenById(kitchenId: Long): Kitchen {
        return kitchenRepository.findByIdOrThrow(kitchenId)
    }
}