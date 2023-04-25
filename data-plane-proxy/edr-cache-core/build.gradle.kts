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
}

dependencies {
    implementation(edcLibs.config.filesystem)

    implementation(edcLibs.dpf.framework)
    implementation(edcLibs.api.observability)
    implementation(edcLibs.core.connector)
    implementation(edcLibs.boot)


    implementation(edcLibs.bundles.monitoring)
    implementation(edcLibs.ext.http)
    implementation(edcLibs.util)
    implementation(edcLibs.dpf.http)

    implementation(project(":data-plane-proxy:data-plane-proxy-provider-spi"))
    implementation(project(":data-plane-proxy:edr-cache-spi"))
}

