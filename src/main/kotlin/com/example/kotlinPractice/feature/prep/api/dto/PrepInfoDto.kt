package com.example.kotlinPractice.feature.prep.api.dto

import com.example.kotlinPractice.domain.entity.Prep
import com.example.kotlinPractice.domain.enums.ExecutionType
import java.time.LocalDate

data class PrepInfoDto(
    val job: String,
    val priority: Int,
    val executionType: ExecutionType,
    val executionDate: LocalDate,
) {
    companion object {
        fun of(prep: Prep): PrepInfoDto {
            return PrepInfoDto(
                job = prep.job,
                priority = prep.priority,
                executionType = ExecutionType.toType(prep.executionStatus),
                executionDate = prep.deadLine,
            )
        }
    }
}
