package com.er453r.ktspa

import com.er453r.ktspa.components.userView
import com.er453r.ktspa.dtos.User
import kotlinx.html.js.div

fun main() {
    KtSPA {
        div {
            +"Start!"
        }

        userView(User(firstName = "Jan", lastName = "Kowalski"))
        userView(User(firstName = "Tomasz", lastName = "Tomaszewski"))
        userView(User(firstName = "Aaaaaa", lastName = "Bbbbbb"))
    }
}
