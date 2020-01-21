package com.er453r.static

import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.stream.createHTML
import kotlinx.html.title

external fun require(module:String):dynamic

fun main() {
    try {
        val fs = require("fs")

        fs.writeFileSync("temp.html", index())

        println("Done!")
    }
    catch (e:Error){
        println("Done!")
    }
}
