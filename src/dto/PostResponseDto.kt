package com.example.dto

import com.example.model.PostModel
import com.example.model.PostType

data class PostResponseDto(
    val id: Long,
    val author: String?,
    val content: String? = null,
    val type: PostType,
    val date: String?,
    val adress: String?,
    val location: Pair<Double?, Double?>?,
    val repost: String?,
    val video: String?,
    val adv: String?,
    val likes: Int = 0,
    val commentsCount: Int=0,
    val commentsByMe: Boolean= false,
    val sharedByMe: Boolean= false,
    val sharedCount: Int=0,
    val repostByMe: Boolean = false,
    val repostCount: Int = 0,
) {
    companion object {
        fun fromModel(model: PostModel) =
            PostResponseDto(
                //у классов естсь объекты компаньоны, мы можем обратиться кним через имя класса.
                id = model.id,
                author = model.author,
                content = model.content,
                type = model.type,
                date = model.date,
                adress = model.adress,
                location = model.location,
                repost = model.repost,
                video = model.video,
                adv = model.adv,
                likes = model.likes,
                commentsCount = model.commentsCount,
                commentsByMe = model.commentsByMe,
                sharedByMe = model.sharedByMe,
                sharedCount = model.sharedCount,
                repostByMe = model.repostByMe,
                repostCount = model.repostCount,
            )
    }
}

