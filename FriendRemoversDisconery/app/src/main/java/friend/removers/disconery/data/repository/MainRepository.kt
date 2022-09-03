package friend.removers.disconery.data.repository

import friend.removers.disconery.data.api.ApiHelper

class MainRepository(private val apiHelper:ApiHelper) {
    suspend fun getFriends() = apiHelper.getFriends()
}