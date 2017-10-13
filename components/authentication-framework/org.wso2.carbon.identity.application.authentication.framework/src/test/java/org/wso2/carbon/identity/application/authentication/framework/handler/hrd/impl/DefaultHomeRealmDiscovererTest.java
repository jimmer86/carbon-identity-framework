/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.handler.hrd.impl;

import org.testng.annotations.Test;
import org.wso2.carbon.identity.application.authentication.framwork.test.utils.CommonTestUtils;
import org.wso2.carbon.identity.testutil.IdentityBaseTest;

import static org.testng.Assert.assertEquals;

public class DefaultHomeRealmDiscovererTest extends IdentityBaseTest {


    @Test
    public void testGetInstance() throws Exception {

        CommonTestUtils.testSingleton(DefaultHomeRealmDiscoverer.getInstance(),
                DefaultHomeRealmDiscoverer.getInstance());
    }

    @Test
    public void testDiscover() throws Exception {

        final String HOME_REALM = "HOME_REALM";
        assertEquals(DefaultHomeRealmDiscoverer.getInstance().discover(HOME_REALM), HOME_REALM);
    }

}