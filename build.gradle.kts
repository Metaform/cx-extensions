plugins {
    `java-library`
    `maven-publish`
}

val javaVersion: String by project
val txScmConnection: String by project
val txWebsiteUrl: String by project
val txScmUrl: String by project
val groupId: String by project
val annotationProcessorVersion: String by project
val metaModelVersion: String by project

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        val edcGradlePluginsVersion: String by project
        classpath("org.eclipse.edc.edc-build:org.eclipse.edc.edc-build.gradle.plugin:${edcGradlePluginsVersion}")
    }
}

// include all subprojects in the jacoco report aggregation
project.subprojects.forEach {
    dependencies {
    }
}

allprojects {
    apply(plugin = "org.eclipse.edc.edc-build")

    repositories {
        mavenCentral()
    }
    dependencies {
        // this is used to counter version conflicts between the JUnit version pulled in by the plugin,
        // and the one expected by IntelliJ
        testImplementation(platform("org.junit:junit-bom:5.9.2"))
    }

    // configure which version of the annotation processor to use. defaults to the same version as the plugin
    configure<org.eclipse.edc.plugins.autodoc.AutodocExtension> {
        processorVersion.set(annotationProcessorVersion)
        outputDirectory.set(project.buildDir)
    }

    configure<org.eclipse.edc.plugins.edcbuild.extensions.BuildExtension> {
        versions {
            // override default dependency versions here
            metaModel.set(metaModelVersion)

        }
        val gid = groupId
        javaLanguageVersion.set(JavaLanguageVersion.of(javaVersion))
    }

    configure<CheckstyleExtension> {
        configFile = rootProject.file("resources/tx-checkstyle-config.xml")
        configDirectory.set(rootProject.file("resources"))

        //checkstyle violations are reported at the WARN level
        this.isShowViolations = System.getProperty("checkstyle.verbose", "false").toBoolean()
    }



    // EdcRuntimeExtension uses this to determine the runtime classpath of the module to run.
    tasks.register("printClasspath") {
        doLast {
            println(sourceSets["main"].runtimeClasspath.asPath)
        }
    }

}

