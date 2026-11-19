plugins {
    kotlin("jvm") version "2.4.10"
    id("org.jetbrains.compose") version "1.12.0"
    id("org.jetbrains.kotlin.plugin.compose") version "2.4.10"
    id("dev.nucleusframework") version "2.5.18"
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(compose.material3)
    implementation("dev.nucleusframework:nucleus.nucleus-application:2.5.18")
    implementation("dev.nucleusframework:nucleus.decorated-window-tao:2.5.18")
    implementation("dev.nucleusframework:nucleus.decorated-window-material3:2.5.18")
}

nucleus.application {
    mainClass = "MainKt"
}
