package com.example.commonlibrary

import android.content.Context

open class ACL{

    private lateinit var context: Context

    fun startEngine(context: Context)
    {
        println("Context Captured")
        this.context = context
    }

    internal fun getACLContext() : Context
    {
        println("Context tried to get.")
        return this.context
    }


}