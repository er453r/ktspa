package com.er453r.ktspa.static

import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.stream.createHTML
import kotlinx.html.title

fun css():String {
    val html = createHTML().html {
        head {
            title("Css")
        }

        body {
            +"Css"
        }
    }

    return html
}
