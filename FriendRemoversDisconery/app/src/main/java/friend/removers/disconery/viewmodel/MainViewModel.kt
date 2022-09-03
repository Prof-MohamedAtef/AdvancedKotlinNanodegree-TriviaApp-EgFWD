package friend.removers.disconery.viewmodel

import android.os.Bundle
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistryOwner
import friend.removers.disconery.data.model.FriendsModel
import friend.removers.disconery.data.repository.MainRepository
import friend.removers.disconery.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(private val mainRepository:MainRepository) : ViewModel() {

    private var friendsList: List<FriendsModel>? = null

    init {
        viewModelScope.launch {
            friendsList = mainRepository.getFriends()
        }
    }

    fun initialize(): List<FriendsModel>? {
        return friendsList
    }

//    private val friends:MutableLiveData<List<FriendsModel>> by lazy {
//        MutableLiveData<List<FriendsModel>>().also {
//            GlobalScope.launch { loadFriends() }
//        }
//    }
//
//    suspend fun getFriends() : LiveData<List<FriendsModel>>{
//        return friends
//    }
//
//    private suspend fun loadFriends(){
//        mainRepository.getFriends()
//    }
}