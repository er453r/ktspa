group = "com.er453r"
version = "0.0.1"

repositories{
    jcenter()
    maven {
        setUrl("https://dl.bintray.com/kotlin/kotlin-js-wrappers/")
    }
}

plugins {
    kotlin("js") version "1.3.61"
}

dependencies{
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx", "kotlinx-html-js", "0.6.12")
    implementation("org.jetbrains", "kotlin-css-js", "1.0.0-pre.90-kotlin-1.3.61")
}

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

    copy {
        from("res")
        into("dist")
    }

    copy {
        from("build/distributions")
        into("dist")
    }
}
