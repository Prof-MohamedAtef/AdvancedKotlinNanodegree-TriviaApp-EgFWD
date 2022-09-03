package friend.removers.disconery.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import friend.removers.disconery.data.api.ApiHelper
import friend.removers.disconery.data.repository.MainRepository

class MainActivityViewModelFactory():ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}
