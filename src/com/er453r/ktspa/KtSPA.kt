package com.er453r.ktspa

import com.er453r.ktspa.static.staticFilesGenerated
import kotlinx.html.TagConsumer
import org.w3c.dom.HTMLElement
import kotlin.browser.document

class KtSPA(block: TagConsumer<HTMLElement>.() -> Unit) {
    init {
        if (!staticFilesGenerated())
            document.addEventListener("DOMContentLoaded", {
                println("KtSPA start!")

                document.body?.append(block)
            })
    }
}
