package com.laneboy.vknewsclient.presentation.comments

import com.laneboy.vknewsclient.domain.entity.FeedPost
import com.laneboy.vknewsclient.domain.entity.PostComment

sealed class CommentsScreenState {

    object Initial : CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>
    ) : CommentsScreenState()
}
