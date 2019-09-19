package com.example.commonlibrary

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.example.commonlibrary.content_provider.ACLInitProvider
import org.jetbrains.annotations.Nullable

class ACLNotification : ACLInitProvider() {
    /*val aclContext = ACLContext

    fun createNotificationWithProgress(title:String,message:String,icon:Int,channelId:String,progress:LiveData<Int>,max:Int)
    {
        val notificationManager = aclContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationBuilder = NotificationCompat.Builder(aclContext, message)

       // progress.observe(LifecycleOwner {  }, Observer {  })
    }
*/
    fun sum(a:Int,b:Int):Int
    {
        return a+b
    }

}