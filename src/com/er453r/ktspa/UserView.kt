package com.er453r.ktspa

import kotlinx.html.TagConsumer
import kotlinx.html.div
import kotlinx.html.span
import org.w3c.dom.HTMLElement

fun TagConsumer<HTMLElement>.userView(user: User) = div {
    div {
        span {
            +"first name:"
        }
        span {
            +user.firstName
        }
    }

    div {
        span {
            +"last name:"
        }
        span {
            +user.lastName
        }
    }
}
