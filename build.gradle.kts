import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("reflect"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation("net.bytebuddy:byte-buddy:1.11.1") // Added for mockk compatibility with JDK16
    testImplementation("io.mockk:mockk:1.11.0")
}

tasks.withType<KotlinCompile> { kotlinOptions.jvmTarget = "16" }

tasks.withType<Test> {
    useJUnitPlatform()
}

kotlin {
    sourceSets["main"].apply {
        kotlin.srcDirs("src")
        resources.srcDirs("resources")
    }
    sourceSets["test"].apply {
        kotlin.srcDir("test")
        resources.srcDir("test_resources")
    }
}
