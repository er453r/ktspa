package com.er453r.ktspa.static

fun staticFilesGenerated(): Boolean {
    val isBrowser = js("typeof variable !== 'undefined'") as Boolean

    println("Browser check: $isBrowser")

    if (!isBrowser) {
        println("Generating static files!")

        val fs = js("eval(require)('fs')")

        fs.writeFileSync("index.html", index())
        fs.writeFileSync("style.css", css())

        println("Static files generated!")
    }

    return !isBrowser
}
