package com.er453r.ktspa.static

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun index() = createHTML().html {
    lang = "en"

    head {
        meta(charset = "utf-8")
        title("KTSPA Index")

        script(src = "ktspa.js"){}
        link(href = "style.css", rel = "stylesheet")
    }

    body {

    }
}
