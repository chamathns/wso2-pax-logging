/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ops4j.pax.logging.test.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import static org.junit.Assert.assertTrue;

public class FactoryTest {

    @Test
    public void paxLoggingSpecificSlf4jFactory() {
        Logger log = LoggerFactory.getLogger(this.getClass());
        log.info("Factory: {}", LoggerFactory.getILoggerFactory());

        assertTrue(LoggerFactory.getILoggerFactory().getClass().getName().startsWith("org.ops4j.pax.logging.slf4j"));
    }

    @Test
    public void paxLoggingSpecificMDC() {
        assertTrue(MDC.getMDCAdapter().getClass().getName().startsWith("org.ops4j.pax.logging.slf4j"));
    }

}
