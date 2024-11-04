package com.example.kotlinPractice.global.error.exception

import com.example.kotlinPractice.global.error.ErrorCode

class BusinessException(
    val errorCode: ErrorCode,
    val data: Any? = null,

) : RuntimeException(errorCode.message)
