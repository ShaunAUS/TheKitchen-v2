package com.example.kotlinPractice.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Image(
    val imageRandomName: String, // Minio 객체키
    val url: String, // Minio URL
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    val menu: Menu,

) : BaseEntity() {
    fun delete() {
        this.deleteFlag = 'Y'
    }

    companion object {
        fun of(imageRandomName: String, imageUrl: String, savedMenu: Menu): Image {
            return Image(
                imageRandomName = imageRandomName,
                url = imageUrl,
                menu = savedMenu,
            )
        }
    }
}
