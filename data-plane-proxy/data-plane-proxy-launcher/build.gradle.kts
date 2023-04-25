/*
 *  Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

plugins {
    `java-library`
    id("application")
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

dependencies {
    implementation(project(":data-plane-proxy:edr-cache-spi"))
    implementation(project(":data-plane-proxy:edr-cache-core"))
    implementation(project(":data-plane-proxy:data-plane-proxy-consumer-api"))
    implementation(project(":data-plane-proxy:data-plane-proxy-provider-api"))
    implementation(project(":data-plane-proxy:data-plane-proxy-provider-core"))
    implementation(edcLibs.config.filesystem)
    implementation(edcLibs.vault.filesystem)
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    exclude("**/pom.properties", "**/pom.xm")
    mergeServiceFiles()
    archiveFileName.set("${project.name}.jar")
}

application {
    mainClass.set("org.eclipse.edc.boot.system.runtime.BaseRuntime")
}


