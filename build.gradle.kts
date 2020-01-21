group = "com.er453r"
version = "0.0.1"

repositories{
    jcenter()
}

plugins {
    kotlin("js") version "1.3.61"
}

dependencies{
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx", "kotlinx-html-js", "0.6.12")
}

sourceSets.create("static")

kotlin {
    target {
        browser {
            webpackTask {
                sourceMaps = true
                outputFileName = "app.js"
            }
        }
    }

    sourceSets["main"].kotlin.srcDir("src")
}

tasks["build"].doLast {
    println("Copying to dist...")

    delete("dist")

    copy {
        from("build/distributions")
        into("dist")
    }

    exec{
        workingDir("dist")
        commandLine("nodejs")
        args("../build/js/packages/ktspa/kotlin/ktspa.js")
    }
}
