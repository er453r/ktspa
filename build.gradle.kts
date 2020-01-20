group = "group"
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

kotlin {
    target {
        browser {}
    }

    sourceSets["main"].kotlin.srcDir("src")
    sourceSets["main"].resources.srcDir("res")
}
