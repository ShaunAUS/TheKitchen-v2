package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.domain.enums.LevelType
import com.example.kotlinPractice.domain.enums.SectionType
import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import java.util.UUID

@Entity
class Member(

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var level: Int,

    @Column(nullable = false)
    var section: Int,

    @Column(nullable = false)
    var experience: Int,

    @Column(nullable = false, unique = true, updatable = false, length = 36)
    var uniqueId: String = UUID.randomUUID().toString(),

    @Column(nullable = false)
    var kitchenId: Long,

    // TODO need??
    @OneToMany(mappedBy = "member", orphanRemoval = true)
    val preps: List<Prep> = emptyList(),

) : BaseEntity() {

    fun update(updateDto: MemberUpdateDto) {
        this.name = updateDto.name
        this.level = LevelType.typeToInt(updateDto.level)
        this.section = SectionType.typeToInt(updateDto.section)
        this.experience = updateDto.experience
    }

    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(memberCreateDto: MemberCreateDto): Member {
            return Member(
                name = memberCreateDto.name,
                level = LevelType.typeToInt(memberCreateDto.level),
                section = SectionType.typeToInt(memberCreateDto.section),
                experience = memberCreateDto.experience,
                kitchenId = memberCreateDto.kitchenId,
            )
        }
    }
}
