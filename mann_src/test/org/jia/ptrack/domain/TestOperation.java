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

import java.util.Date;

import org.jia.test.Utils;
import junit.framework.TestCase;

public class TestOperation extends TestCase
{
  protected Operation operation;
  protected IStatusCoordinator statusCoordinator;

  public TestOperation(String s)
  {
    super(s);
  }

  protected void setUp()
  {
    operation = new Operation(null, null, null, null, null);
    statusCoordinator = new MemoryStatusCoordinator();
  }

  public void testNoArgConstructor()
  {
    Date beforeConstructionTime = new Date();
    operation = new Operation();
    Date afterConstructionTime = new Date();
    assertTrue("timestamp not set to construction time",
               (beforeConstructionTime.getTime() <=
                operation.getTimestamp().getTime()) &&
               (operation.getTimestamp().getTime() <=
                afterConstructionTime.getTime()));
    assertNull("comments property not null", operation.getComments());
    assertNull("fromStatus property not null", operation.getFromStatus());
    assertNull("toStatus property not null", operation.getToStatus());
    assertNull("user property not null", operation.getUser());
  }

  public void testConstructor()
  {
    Date timestamp = new Date();
    User user = new User("test", "Joe", "Test", "password",
                         RoleType.DEVELOPMENT_MANAGER);
    IStatus fromStatus = statusCoordinator.getInitialStatus();
    IStatus toStatus = statusCoordinator.getInitialStatus().
        getApprovalStatus().getApprovalStatus();
    String comments = "comments";
    operation = new Operation(timestamp, user, fromStatus, toStatus, comments);
    assertEquals("timestamp property not set correctly",
                 timestamp, operation.getTimestamp());
    assertEquals("comments property not set correctly",
                 comments, operation.getComments());
    assertEquals("fromStatus property not set correctly",
                 fromStatus, operation.getFromStatus());
    assertEquals("toStatus property not set correctly",
                 toStatus, operation.getToStatus());
    assertEquals("user property not set correctly",
                 user, operation.getUser());
  }

  public void testCommentsProperty()
  {
    Utils.testProperty(operation, "comments", "test value", true, this);
  }

  public void testTimestampProperty()
  {
    Utils.testProperty(operation, "timestamp", new Date(), true, this);
  }

  public void testFromStatusProperty()
  {
    IStatus status = statusCoordinator.getInitialStatus();
    Utils.testProperty(operation, "fromStatus", status, true, this);
  }

  public void testToStatusProperty()
  {
    IStatus status = statusCoordinator.getInitialStatus();
    Utils.testProperty(operation, "toStatus", status, true, this);
  }

  public void testGetUserProperty()
  {
    Utils.testProperty(operation, "user", new User(), true, this);
  }
}
