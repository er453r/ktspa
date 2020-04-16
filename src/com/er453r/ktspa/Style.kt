package com.er453r.ktspa

import kotlinx.css.*

class Style {
    init {
        val styles = CSSBuilder().apply {
            body {
                margin(0.px)
                padding(0.px)
            }
        }

        styles.toString()
    }
}
