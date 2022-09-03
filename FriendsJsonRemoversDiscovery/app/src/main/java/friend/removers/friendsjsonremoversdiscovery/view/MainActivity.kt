package friend.removers.disconery.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import friend.removers.disconery.R
import friend.removers.disconery.utils.App
import friend.removers.disconery.viewmodel.MainViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    //https://drive.google.com/file/d/1JPhi_VknjXuz00QX0O837HpR831CJmqd/view?usp=sharing
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.instance=applicationContext
        val viewmodel: MainViewModel by viewModels()
        val friendsList= viewmodel.initialize()

        if (friendsList != null) {
            for(item in friendsList){
                for(x in item.friends_v2){
                    println(x.name+"/n")
                }
            }
        }



//        var list: List<FriendsModel> = ParseJson.convertJson()
//        var indexZero= list[0].friends_v2
//        for(item in indexZero){
//            println(item.name +"/n")
//        }
    }
}