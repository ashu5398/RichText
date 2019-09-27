package com.example.commonlibrary

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Handler
import android.widget.Toast
import androidx.core.app.NotificationCompat


class ACLNotification : ACL(){
    //private val aclContext = getACLContext()

    fun createIndeterminateProgressNotification(acl:ACL,icon:Int,channelId:Int,title:String,message:String,time:Long)
    {
        val aclContext = acl.getACLContext()
        Toast.makeText(aclContext,"Creating Notification",Toast.LENGTH_SHORT).show()
        val mNotifyManager = aclContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?
        val mBuilder = NotificationCompat.Builder(aclContext,channelId.toString()).apply {
            setContentTitle(title)
            setContentText(message)
            setSmallIcon(icon)
            setProgress(0, 0, true)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            mNotifyManager?.createNotificationChannel(NotificationChannel(channelId.toString(),"Notification",NotificationManager.IMPORTANCE_DEFAULT))
        }
        mNotifyManager?.notify(channelId,mBuilder.build())
        Handler().postDelayed(
            {
                mNotifyManager?.cancel(channelId)
            },time
        )
    }

    fun cancelIndeterminateProgressNotification()
    {

    }
}