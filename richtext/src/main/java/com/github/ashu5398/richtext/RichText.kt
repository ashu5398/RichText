package com.example.commonlibrary.richtext

import android.text.Html
import android.text.Spanned
import androidx.annotation.Nullable

object RichText {

    private val startText = "<body><p>"
    private val endText = "</p></body>"
    private var midText = ""

    fun make(vararg textSpans: TextSpan): Spanned {
        for (textSpan in textSpans) {
            midText += textSpan.make()
        }
        val finalText = startText + midText + endText
        println("final Text: $finalText")
        return Html.fromHtml(finalText)
    }
}

class TextSpan(
    private val text: String, @Nullable val style: TextStyle = TextStyle(),
    private val isNewLine: Boolean = false
) {
    internal fun make(): String {
        return style.make(text) + if (isNewLine) "<br>" else ""
    }
}

class TextStyle(
    private var bold: Boolean = false,
    private var underline: Boolean = false,
    private var italic: Boolean = false,
    private var textColor: String = "#000000",
    private var isSmall: Boolean = false,
    private var link: String = ""
) {
    private var startText = "<span>"
    private var endText = "</span>"

    internal fun make(text: String): String {
        if (bold) {
            startText += "<strong>"; endText = "</strong>$endText"
        }
        if (underline) {
            startText += "<u>"; endText = "</u>$endText"
        }
        if (italic) {
            startText += "<i>"; endText = "</i>$endText"
        }
        if (isSmall) {
            startText += "<small>"; endText = "</small>$endText"
        }
        startText += "<font color=\"$textColor\">"
        endText = "</font>$endText"
        if (link != "") {
            startText += "<a href=\"$link\">"; endText = "</a>$endText"
        }

        return startText + text + endText
    }

}