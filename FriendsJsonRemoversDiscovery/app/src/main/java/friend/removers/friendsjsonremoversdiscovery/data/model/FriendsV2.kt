package friend.removers.disconery.data.model

import com.google.gson.annotations.SerializedName

data class FriendsV2(
    val contact_info: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("timestamp")
    val timestamp: Int
)