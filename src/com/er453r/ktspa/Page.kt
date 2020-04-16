package com.er453r.ktspa


import kotlinx.html.*
import kotlinx.html.stream.createHTML

class Page {
    init {
        val docuemnt = createHTML().apply {
            html {
                head {
                    title(content = "KtSPA")
                    meta(name = "charset", content = "utf-8")
                    script(src = "app.js"){}
                }

                body {

                }
            }
        }
    }
}
