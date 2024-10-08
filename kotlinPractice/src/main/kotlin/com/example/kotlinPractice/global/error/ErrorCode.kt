package com.example.kotlinPractice.global.error

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val httpStatus: HttpStatus,
    val errorCode: String,
    val message: String,

    ) {

    NOT_FOUND_MEMBER(HttpStatus.OK, "B001", "not found member exception"),

}
