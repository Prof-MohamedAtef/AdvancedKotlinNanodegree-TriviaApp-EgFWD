package friend.removers.disconery.data.api

class ApiHelper(private val apiService:ApiService) {
    suspend fun getFriends()=apiService.getFriends()
}