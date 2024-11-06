package com.example.kotlinPractice.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Image(
    imageRandomName: String,
    url: String,
    menu: Menu,
) : BaseEntity() {
    var imageRandomName: String = imageRandomName
        protected set

    var url: String = url
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    var menu: Menu = menu
        protected set

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
