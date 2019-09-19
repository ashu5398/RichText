package com.example.librarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.commonlibrary.ACLNotification

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aclNotification = ACLNotification()

        findViewById<TextView>(R.id.tv_sum).text = aclNotification.sum(2,3).toString()

    }
}
