package com.example.librarytest

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.example.commonlibrary.richtext.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = RichText().make(
            TextSpan("I have read and accept the", TextStyle(bold = true, underline = true, fontSize = 20),false),
            TextSpan(" terms and condition.", TextStyle(textColor = "#149fcc",link = "https://www.google.com"),false)
        )
        tv_test.text = text
        tv_test.movementMethod = LinkMovementMethod()
//        acl.startEngine(applicationContext)

        //findViewById<TextView>(R.id.tv_sum).text = aclNotification.sum(2,3).toString()


    }

/*    @RequiresApi(O)
    fun doTask(view: View) {
        ACLNotification().createIndeterminateProgressNotification(acl,R.drawable.ic_notifications_black_24dp,12,"Hi","Test Notification",2000)

    }*/
}
