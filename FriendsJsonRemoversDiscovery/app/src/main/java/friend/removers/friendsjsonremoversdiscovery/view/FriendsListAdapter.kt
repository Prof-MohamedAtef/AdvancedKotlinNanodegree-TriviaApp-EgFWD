package friend.removers.disconery.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import friend.removers.disconery.R
import friend.removers.disconery.data.model.FriendsV2

class FriendsListAdapter(
    // on below line we are passing variables
    // as course list and context
    private var friendList: ArrayList<FriendsV2>,
) : RecyclerView.Adapter<FriendsListAdapter.FriendsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FriendsViewHolder {
        // this method is use to inflate the layout file which
        // we have created for our recycler view.
        // on below line we are inflating our layout file.
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.friend_list_item,
            parent, false
        )
        // at last we are returning our view
        // holder class with our item View File.
        return FriendsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {
        // on below line we are setting data to our text view and our image view.
        holder.friendName.text = friendList.get(position).name
        holder.friendID.text = friendList.get(position).timestamp.toString()
    }

    override fun getItemCount(): Int {
        // on below line we are
        // returning our size of our list
        return friendList.size
    }

    class FriendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // on below line we are initializing our
        // course name text view and our image view.
        val friendName: TextView = itemView.findViewById(R.id.tvFriendName)
        val friendID: TextView = itemView.findViewById(R.id.tvID)
    }
}