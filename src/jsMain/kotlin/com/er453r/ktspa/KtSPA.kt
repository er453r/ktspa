package com.er453r.ktspa

import com.er453r.ktspa.static.staticFilesGenerated
import kotlinx.browser.document
import kotlinx.html.TagConsumer
import kotlinx.html.dom.append
import org.w3c.dom.HTMLElement

class KtSPA(block: TagConsumer<HTMLElement>.() -> Unit) {
    init {
        if (!staticFilesGenerated())
            document.addEventListener("DOMContentLoaded", {
                debug("KtSPA start!", LogType.EVENT)

                document.body!!.append(block = block)
            })
    }
}

enum class LogType {
    EVENT,
    ROUTING,
}

fun debug(s: String, color: LogType? = null) {
    console.log(
        "%c $s", when (color) {
            null -> ""
            LogType.EVENT -> "background: #FF0; color: #000000"
            LogType.ROUTING -> "background: #09F; color: #000000"
        }
    )
}

