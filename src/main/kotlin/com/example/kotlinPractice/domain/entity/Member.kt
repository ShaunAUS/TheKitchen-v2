package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.domain.enums.LevelType
import com.example.kotlinPractice.domain.enums.SectionType
import com.example.kotlinPractice.feature.member.api.dto.MemberCreateDto
import com.example.kotlinPractice.feature.member.api.dto.MemberUpdateDto
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import java.util.UUID

@Entity
class Member(
    name: String,
    level: Int,
    section: Int,
    experience: Int,
    kitchenId: Long,
) : BaseEntity() {

    @Column(nullable = false)
    var name: String = name
        protected set

    @Column(nullable = false)
    var level: Int = level
        protected set

    @Column(nullable = false)
    var section: Int = section
        protected set

    @Column(nullable = false)
    var experience: Int = experience
        protected set

    @Column(nullable = false)
    var kitchenId: Long = kitchenId
        protected set

    @Column(nullable = false, unique = true, updatable = false, length = 36)
    val uniqueId: String = UUID.randomUUID().toString()

    @OneToMany(mappedBy = "member", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val _preps: MutableList<Prep> = mutableListOf()
    val preps: List<Prep> get() = _preps.toList()

    fun addPrep(prep: Prep) {
        _preps.add(prep)
    }

    fun update(updateDto: MemberUpdateDto) {
        this.name = updateDto.name
        this.level = LevelType.toInt(updateDto.level)
        this.section = SectionType.toInt(updateDto.section)
        this.experience = updateDto.experience
    }

    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(memberCreateDto: MemberCreateDto): Member {
            return Member(
                name = memberCreateDto.name,
                level = LevelType.toInt(memberCreateDto.level),
                section = SectionType.toInt(memberCreateDto.section),
                experience = memberCreateDto.experience,
                kitchenId = memberCreateDto.kitchenId,
            )
        }
    }
}
