package com.example.kotlinPractice.feature.prep.api

import com.example.kotlinPractice.domain.entity.Member
import com.example.kotlinPractice.domain.entity.Prep
import com.example.kotlinPractice.domain.repository.MemberRepository
import com.example.kotlinPractice.domain.repository.PrepRepository
import com.example.kotlinPractice.feature.member.api.dto.MemberWithPrepInfoDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepInfoDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepListCreateDto
import com.example.kotlinPractice.feature.prep.api.dto.PrepUpdateDto
import com.example.kotlinPractice.global.error.ErrorCode
import com.example.kotlinPractice.global.error.exception.BusinessException
import com.example.kotlinPractice.global.utils.findByIdOrThrow
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Slf4j
class PrepServiceImpl(
    private val prepRepository: PrepRepository,
    private val memberRepository: MemberRepository,
) : PrepService {

    // 다른 맴버에게 주는 형식
    // 프렙리스트를 줄때는 한사람에게만 주어진다
    @Transactional
    override fun createPrepToTargetMember(prepListCreateDtos: PrepListCreateDto): MemberWithPrepInfoDto {
        val targetMember = findMemberByUniqueIdOrThrow(prepListCreateDtos.targetMemberUniqueId)
        prepRepository.saveAll(
            prepListCreateDtos.prepCreateDtos
                .map { prepCreateDto -> Prep.of(prepCreateDto, targetMember) }
                .toList(),
        )
        return MemberWithPrepInfoDto.of(targetMember)
    }

    @Transactional
    override fun updatePrepStatus(prepUpdateDto: PrepUpdateDto): PrepInfoDto {
        val prepById = prepRepository.findByIdOrThrow(prepUpdateDto.prepId)
        prepById.updatePrepStatus(prepUpdateDto.executionType)

        return PrepInfoDto.of(prepById)
    }

    private fun findMemberByUniqueIdOrThrow(memberUniqueId: String): Member {
        return memberRepository.findBy(memberUniqueId) ?: throw BusinessException(ErrorCode.NOT_FOUND_MEMBER)
    }
}
