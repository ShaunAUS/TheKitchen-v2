package com.example.kotlinPractice.global.utils

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull
import java.lang.IllegalStateException

// nothing = 함수의 실행이 끝나도 호출 코드로 복귀 안함 즉 의도적으로 예외를 발생시킴
fun fail(): Nothing {
    throw IllegalArgumentException()
}

// TODO 여기서 에러 처리하는게 좋을까 기존처럼 exception으로 처리하는게 좋을까..?
fun empty(): Nothing {
    throw NoSuchElementException("No value present")
}

fun notEnough(): Nothing {
    throw IllegalStateException("Not enough ingredient")
}

fun <T, ID> CrudRepository<T, ID>.findByIdOrThrow(id: ID): T {
    return this.findByIdOrNull(id) ?: empty()
}
