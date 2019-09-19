package com.example.commonlibrary.content_provider

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.pm.ProviderInfo
import android.database.Cursor
import android.net.Uri
import java.lang.NullPointerException

open class ACLInitProvider : ContentProvider() {
    lateinit var ACLContext: Context

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        return null
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        return 0
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        return 0
    }

    override fun getType(uri: Uri): String? {
        return null
    }

    override fun onCreate(): Boolean {
        ACLContext = context!!
        return true
    }

    override fun attachInfo(context: Context?, info: ProviderInfo?) {
        check(info == null){"ACL provider info can not be null."}
        check("com.example.commonlibrary.content_provider.ACLInitProvider" != info?.authority) { "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle." }
    }
}