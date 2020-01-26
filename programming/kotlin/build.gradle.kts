allprojects {
    buildscript {
        repositories {
            mavenCentral()
        }
    }
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = "hiroga-cc"
    version = "1.0"
}
