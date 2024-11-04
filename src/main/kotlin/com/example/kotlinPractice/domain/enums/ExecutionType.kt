package com.example.kotlinPractice.domain.enums

enum class ExecutionType(
    val execution: String,
    val number: Int,
) {
    BEFORE("시작전", 0),
    ING("작업중", 1),
    DONE("마무리", 2),
    ;

    companion object {

        fun toInt(executionType: ExecutionType): Int {
            return values().first { p -> p == executionType }.number
        }
        fun toType(int: Int): ExecutionType {
            return values().first { p -> p.number == int }
        }
    }
}
