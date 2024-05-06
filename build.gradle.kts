 plugins {
    java
    application
 }

 repositories { // Where to search for dependencies
    mavenCentral()
 }

application {
    mainClass.set("main.java.Azanzi")
}