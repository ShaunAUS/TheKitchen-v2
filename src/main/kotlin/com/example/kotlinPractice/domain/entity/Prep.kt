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
    job: String,
    deadLine: LocalDate,
    executionStatus: Int,
    priority: Int,
    member: Member,
) : BaseEntity() {

    @Column(nullable = false)
    var job: String = job
        protected set

    @Column(nullable = false)
    var deadLine: LocalDate = deadLine
        protected set

    @Column(nullable = false)
    var executionStatus: Int = executionStatus
        protected set

    @Column(nullable = false)
    var priority: Int = priority
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    var member: Member = member
        protected set

    fun updatePrepStatus(executionType: ExecutionType) {
        this.executionStatus = ExecutionType.toInt(executionType)
    }

    companion object {
        fun of(prepListCreateDto: PrepCreateDto, targetMember: Member): Prep {
            return Prep(
                job = prepListCreateDto.job,
                deadLine = prepListCreateDto.deadLine,
                executionStatus = ExecutionType.toInt(prepListCreateDto.executionType),
                priority = prepListCreateDto.priority,
                member = targetMember,
            )
        }
    }
}
