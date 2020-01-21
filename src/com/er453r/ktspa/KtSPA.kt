package com.er453r.ktspa

import com.er453r.ktspa.components.userView
import com.er453r.ktspa.dtos.User
import com.er453r.ktspa.static.staticFilesGenerated
import kotlinx.html.dom.append
import kotlinx.html.js.div
import kotlin.browser.document

fun main() {
    if (staticFilesGenerated())
        return

    document.addEventListener("DOMContentLoaded", {
        println("KtSPA start!")

        document.body?.append {
            div {
                +"Start!"
            }

            userView(User(firstName = "Jan", lastName = "Kowalski"))
            userView(User(firstName = "Tomasz", lastName = "Tomaszewski"))
            userView(User(firstName = "Aaaaaa", lastName = "Bbbbbb"))
        }
    })
}
