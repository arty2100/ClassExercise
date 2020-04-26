package com.galaktionov.vk

interface WallPostInterface {

    val postType : String

    companion object {
        const val POST_TYPE_POST = "post"
        const val POST_TYPE_COPY = "copy"
        const val POST_TYPE_REPLY = "reply"
        const val POST_TYPE_POSTPONE = "postpone"
        const val POST_TYPE_SUGGEST = "suggest"
    }

}