import org.gradle.jvm.toolchain.JavaLanguageVersion.of

plugins {
	kotlin("jvm") version "1.6.10"
	kotlin("kapt") version "1.6.10"
	id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
	maven("https://papermc.io/repo/repository/maven-public/") // Paper & Velocity
  mavenCentral()
}

dependencies {
	compileOnly("io.papermc.paper:paper-api:1.18.2-R0.1-SNAPSHOT") // Paper
	compileOnly("com.velocitypowered:velocity-api:3.1.1") // Velocity

	kapt("com.velocitypowered:velocity-api:3.1.1") // Velocity
}

java.toolchain.languageVersion.set(of(17))