package com.example.librarytest

import android.os.Build.VERSION_CODES.O
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.commonlibrary.ACL
import com.example.commonlibrary.ACLNotification


class MainActivity : AppCompatActivity() {
    private var acl:ACL = ACL()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        acl.startEngine(applicationContext)

        //findViewById<TextView>(R.id.tv_sum).text = aclNotification.sum(2,3).toString()


    }

    @RequiresApi(O)
    fun doTask(view: View) {
        ACLNotification().createIndeterminateProgressNotification(acl,R.drawable.ic_notifications_black_24dp,12,"Hi","Test Notification",2000)

    }
}
