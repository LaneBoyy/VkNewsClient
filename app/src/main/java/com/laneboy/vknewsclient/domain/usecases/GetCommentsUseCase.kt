package com.laneboy.vknewsclient.domain.usecases

import com.laneboy.vknewsclient.domain.entity.FeedPost
import com.laneboy.vknewsclient.domain.entity.PostComment
import com.laneboy.vknewsclient.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    operator fun invoke(feedPost: FeedPost): StateFlow<List<PostComment>> {
        return repository.getComments(feedPost)
    }
}
