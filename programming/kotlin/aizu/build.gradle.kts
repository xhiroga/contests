import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("junit:junit:4.12")
    testImplementation(project(":test-utility"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
