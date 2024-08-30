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
                logger.init()

                logger.info("This so derp")
                logger.warn("This so derp")
                logger.error("This so derp")

                document.body!!.append(block = block)
            })
    }
}

