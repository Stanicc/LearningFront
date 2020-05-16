plugins {
    id("org.jetbrains.kotlin.js") version "1.3.72"
}

group = "stanic.learningfront"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

kotlin {
    sourceSets["main"].dependencies {
        implementation(npm("react", "16.12.0"))
        implementation(npm("react-dom", "16.12.0"))
        implementation(npm("@material-ui/core", "^4.9.14"))
        implementation(npm("react-hot-loader", "^4.12.20"))
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.105-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.105-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-css-js:1.0.0-pre.105-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.105-kotlin-1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:1.3.5")
}

kotlin.target.browser { }