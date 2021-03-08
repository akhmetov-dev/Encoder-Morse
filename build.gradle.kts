plugins {
    java
    application
}

group = "ahmetoff"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.13.2")

}

application {
    mainClass.set("Starter")
}
