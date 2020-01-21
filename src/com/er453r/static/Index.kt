package com.er453r.static

import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.stream.createHTML
import kotlinx.html.title

fun index():String {
    val html = createHTML().html {
        head {
            title("index")
        }

        body {
            +"index"
        }
    }

    return html
}
