package com.example.kotlinPractice.domain.enums

enum class EnoughType(
    val enoughStatus: String,
    val number: Int,
) {
    ENOUGH("충분함", 0),
    NOTENOUGH("부족함", 1),
    ;

    companion object {

        fun toInt(executionType: EnoughType): Int {
            return EnoughType.values().first { p -> p == executionType }.number
        }

        fun toType(int: Int): EnoughType {
            return EnoughType.values().first { p -> p.number == int }
        }
    }
}
