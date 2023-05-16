plugins {
    java
    kotlin("jvm") version "1.6.10"
}

group = "com.arlanallacsta.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
}
