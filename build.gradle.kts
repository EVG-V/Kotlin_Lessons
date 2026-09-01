plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "ru.otus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}

application {
    mainClass.set("ru.otus.MainKt")
}