package com.er453r.ktspa.static

import kotlinx.css.*

fun css() = CssBuilder().apply {
    body {
        margin = Margin(1.em)

        fontSize = 2.em

        color = Color.gray
    }
}.toString()
