package com.example.kotlinPractice.global.utils

import org.springframework.stereotype.Component
import org.springframework.web.multipart.MultipartFile
import java.util.UUID

@Component
class MediaUtils {
    fun makeRandomImageNameBy(image: MultipartFile): String {
        // 업로드 이름
        val originalFilename: String = image.originalFilename.toString()

        // 확장자 ex) jpg
        val ext = originalFilename.substring(originalFilename.lastIndexOf("."))

        // 서버저장이름 = 랜덤이름 + 확장자명
        return UUID.randomUUID().toString() + ext
    }
}
