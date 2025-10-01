version = "1.1.67"
group = "com.github.m9w"

plugins { `maven-publish`; kotlin("jvm") version "2.1.20" }

kotlin { jvmToolchain(17) }

repositories { mavenCentral() }

publishing {
    java.withSourcesJar()

    publications.create<MavenPublication>("maven") {
        from(components["kotlin"])
    }
}