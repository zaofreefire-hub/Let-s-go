plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    mavenCentral()
}

tasks.register<Jar>("buildCs3") {
    group = "cloudstream"
    description = "Build CloudStream cs3 plugin"

    archiveBaseName.set("TestProvider")
    archiveExtension.set("cs3")

    from(sourceSets.main.get().output)
}
