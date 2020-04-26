package com.galaktionov.vk

class WallPost(id: Int, val ownerId: Int, val fromId: Int, val createdBy: Int, val date: Long, var text: String,
               val replyOwnerId: Int, val replyPostId: Int, val postType: String, val signerId: Int, var friendsOnly: Int = 0, var canPin : Int =0, var canDelete : Int = 0, var canEdit : Int =0) : Common(id){


}
