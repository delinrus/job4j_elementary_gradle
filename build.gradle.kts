plugins {
    application
    checkstyle
}

group = "ru.job4j"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "ru.job4j.Main"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.test {
    useJUnitPlatform()
}

checkstyle {
    toolVersion = "10.3.3"
    configFile = file("checkstyle.xml")
    // Fail build on any Checkstyle errors
    isIgnoreFailures = false
}
