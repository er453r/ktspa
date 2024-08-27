import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

group = "com.er453r"
version = "0.0.1"

plugins {
    kotlin("multiplatform") version "2.0.20"
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
//    implementation(kotlin("stdlib-js"))
//    implementation("org.jetbrains.kotlinx", "kotlinx-html-js", "0.6.12")
//    implementation("org.jetbrains", "kotlin-css-js", "1.0.0-pre.90-kotlin-1.3.61")

}

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            val kotlinxHtmlVersion = "0.11.0"

            implementation("org.jetbrains.kotlinx:kotlinx-html:$kotlinxHtmlVersion")
            implementation("org.jetbrains.kotlin-wrappers:kotlin-css:1.0.0-pre.798")
        }
    }
}

tasks["build"].doLast {
    println("Copying to dist...")

    delete("dist")

    copy {
        from("build/dist/js/productionExecutable")
        into("dist")
    }

    exec {
        workingDir("dist")
        commandLine("nodejs")
        args("../build/js/packages/ktspa/kotlin/ktspa.js")
    }
}

