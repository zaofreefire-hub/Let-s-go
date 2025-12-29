plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.recloudstream:cloudstream:4.4.0")
}

tasks.register<Jar>("buildCs3") {
    archiveExtension.set("cs3")
    from(sourceSets.main.get().output)
}
