package friend.removers.disconery.data.model

import com.google.gson.annotations.SerializedName

data class FriendsModel(
    @SerializedName("friends_v2")
    val friends_v2: List<FriendsV2>
)