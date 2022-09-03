package friend.removers.disconery.data.api

import friend.removers.disconery.data.model.FriendsModel
import retrofit2.http.GET

interface ApiService {
    @GET("/drive/folders/0Byr3rFgTHmk8d01CTExtR0FSdVE?resourcekey=0-AKQpIATkr-wIOX0tvx1dAA")
    suspend fun getFriends():List<FriendsModel>
}