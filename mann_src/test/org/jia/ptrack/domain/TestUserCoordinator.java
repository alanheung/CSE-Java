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

import junit.framework.TestCase;

public class TestUserCoordinator extends TestCase
{
  MemoryUserCoordinator userCoordinator;

  public TestUserCoordinator(String s)
  {
    super(s);
  }

  protected void setUp()
  {
    userCoordinator = new MemoryUserCoordinator();
  }

  protected void tearDown()
  {
  }

  public void testGetUser() throws DataStoreException
  {
    User user = userCoordinator.getUser("proj_mgr", "faces");
    assertTrue("Wrong User object", user.getLogin().equals("proj_mgr"));

    user = userCoordinator.getUser("dev_mgr", "faces");
    assertTrue("Wrong User object", user.getLogin().equals("dev_mgr"));

    user = userCoordinator.getUser("qa_mgr", "faces");
    assertTrue("Wrong User object", user.getLogin().equals("qa_mgr"));

    user = userCoordinator.getUser("sys_mgr", "faces");
    assertTrue("Wrong User object", user.getLogin().equals("sys_mgr"));

    boolean found = true;
    try { user = userCoordinator.getUser("qa_mgr", "1javaserverfaces"); }
    catch (ObjectNotFoundException e) { found = false; }
    assertTrue("Unexpected user found", !found);

    try { user = userCoordinator.getUser("1qa_mgr", "faces"); }
    catch (ObjectNotFoundException e) { found = false; }
    assertTrue("Unexpected user found", !found);

    try { user = userCoordinator.getUser("1qa_mgr", "1javaserverfaces"); }
    catch (ObjectNotFoundException e) { found = false; }
    assertTrue("Unexpected user found", !found);
  }
}
