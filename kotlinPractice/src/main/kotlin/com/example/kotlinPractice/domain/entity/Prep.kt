package com.example.kotlinPractice.domain.entity

import com.example.kotlinPractice.domain.enums.ExecutionType
import com.example.kotlinPractice.feature.prep.api.dto.PrepCreateDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDate

@Entity
class Prep(

    @Column(nullable = false)
    val job: String,

    @Column(nullable = false)
    val deadLine: LocalDate,

    @Column(nullable = false)
    var executionStatus: Int,

    @Column(nullable = false)
    val priority: Int,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    var member: Member,

) : BaseEntity() {

    fun updatePrepStatus(executionType: ExecutionType) {
        this.executionStatus = ExecutionType.typeToInt(executionType)
    }

    companion object {
        fun of(prepCreateDto: PrepCreateDto, targetMember: Member): Prep {
            return Prep(
                job = prepCreateDto.job,
                deadLine = prepCreateDto.deadLine,
                executionStatus = ExecutionType.typeToInt(prepCreateDto.executionType),
                priority = prepCreateDto.priority,
                member = targetMember
            )
        }
    }
}
