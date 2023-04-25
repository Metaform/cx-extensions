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
    id("io.swagger.core.v3.swagger-gradle-plugin")
}

dependencies {

    implementation(edcLibs.rsApi)
    implementation(edcLibs.spi.http)
    implementation(edcLibs.util)
    implementation(edcLibs.dpf.framework)
    implementation(edcLibs.api.observability)
    implementation(edcLibs.dpf.util)
    implementation(edcLibs.ext.http)
    implementation(edcLibs.spi.jwt)
    implementation(edcLibs.jwt.core)

    implementation(edcLibs.nimbus)


    implementation(project(":data-plane-proxy:data-plane-proxy-provider-spi"))
}

