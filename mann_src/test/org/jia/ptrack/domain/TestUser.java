/**
   JavaServer Faces in Action example code, Copyright (C) 2004 Kito D. Mann.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

**/

package org.jia.ptrack.domain;

import org.jia.test.Utils;
import junit.framework.TestCase;

public class TestUser extends TestCase
{
  User user;

  public TestUser(String s)
  {
    super(s);
  }

  protected void setUp()
  {
    user = new User("testUser", "Mr.", "Test", "testPassword",
                    RoleType.DEVELOPMENT_MANAGER);
  }

  protected void tearDown()
  {
  }

  public void testLoginProperty()
  {
    Utils.testProperty(user, "login", "testUser", true, this);
  }

  public void testFirstNameProperty()
  {
    Utils.testProperty(user, "firstName", "Mr.", true, this);
  }

  public void lastNameProperty()
  {
    Utils.testProperty(user, "lastName", "Test", true, this);
  }

  public void testPasswordProperty()
  {
    Utils.testProperty(user, "password", "testPassword", true, this);
  }

  public void testRoleProperty()
  {
    Utils.testProperty(user, "role", RoleType.DEVELOPMENT_MANAGER, true, this);
  }
}
