package com.laneboy.vknewsclient.domain.usecases

import com.laneboy.vknewsclient.domain.entity.FeedPost
import com.laneboy.vknewsclient.domain.repository.NewsFeedRepository
import javax.inject.Inject

class ChangeLikeStatusUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}
