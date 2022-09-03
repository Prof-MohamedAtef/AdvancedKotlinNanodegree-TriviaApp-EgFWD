package friend.removers.disconery.utils

import android.app.Application
import android.content.Context

class App : Application() {

    companion object {
        lateinit var instance: Context
    }
}