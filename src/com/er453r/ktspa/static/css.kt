package com.er453r.ktspa.static

import kotlinx.css.*

fun css() = CSSBuilder().apply {
    body {
        margin(0.px)

        fontSize = 2.em

        color = Color.azure
    }
}.toString()
