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
import java.util.List;

import org.jia.test.Utils;
import junit.framework.TestCase;

public class TestProject extends TestCase
{
  Project project;
  IStatusCoordinator statusCoordinator;
  IStatus initialStatus;

  public TestProject(String s)
  {
    super(s);
  }

  protected void setUp()
  {
    statusCoordinator = new MemoryStatusCoordinator();
    initialStatus = statusCoordinator.getInitialStatus();
    project = new Project(initialStatus);
  }

  protected void tearDown()
  {
  }

  public void testConstructor()
  {
    project = new Project();
    assertEquals("status property not null", null,
                 project.getStatus());

    project = new Project(initialStatus);
    assertEquals("status property not initialized", initialStatus,
                 project.getStatus());
  }

  public void testNameProperty()
  {
    Utils.testProperty(project, "name", "test value", true, this);
  }

  public void testInitiatedByProperty()
  {
    Utils.testProperty(project, "initiatedBy", "test value", true, this);
  }

  public void testRequirementsContactProperty()
  {
    Utils.testProperty(project, "requirementsContact", "test value", true, this);
  }

  public void testDescriptionProperty()
  {
    Utils.testProperty(project, "description", "test value", true, this);
  }

  public void testTypeProperty()
  {
    Utils.testProperty(project, "type", ProjectType.EXTERNAL_DB, true, this);
  }

  public void testIdProperty()
  {
    Utils.testProperty(project, "id", "test value", true, this);
  }

  public void testRequirementsContactEmailProperty()
  {
    Utils.testProperty(project, "requirementsContactEmail", "test value",
                       true, this);
  }

  public void testArtifactsProperty()
  {
    ArtifactType[] artifacts = new ArtifactType[]
                              { ArtifactType.PROPOSAL,
                                ArtifactType.ARCHITECTURE,
                                ArtifactType.MAINTENANCE };
    Utils.testProperty(project, "artifacts", artifacts, true, this);
  }

  public void testChangeStatus()
  {
    User user = new User("login", "Test", "User", "password",
                         RoleType.QA_MANAGER);
    int count = 0;
    IStatus currentStatus = project.getStatus();
    while (!currentStatus.isFinalState())
    {
      count++;
      currentStatus = testChangeStatus(user, count, currentStatus, true);
    }

    Date beforeStatusChangeTime = new Date();
    project.changeStatus(false, user, "comments");
    Date afterStatusChangeTime = new Date();
    List history = project.getHistory();
    Operation lastOperation = (Operation)history.get(history.size() - 1);
    this.assertTrue("invalid time stamp",
                    ((beforeStatusChangeTime.getTime() <=
                      lastOperation.getTimestamp().getTime()) &&
                     (lastOperation.getTimestamp().getTime() <=
                      afterStatusChangeTime.getTime())));
    this.assertTrue("status", project.getStatus().isFinalState()); // can't be modified after it hits the final state
  }

  private IStatus testChangeStatus(User user, int count, IStatus currentStatus,
                                boolean approve)
  {
    String comments = "operation " + count;
    Date timestamp = new Date();

    project.changeStatus(timestamp, approve, user, comments);

    List history = project.getHistory();
    Operation lastOperation = (Operation)history.get(history.size() - 1);
    assertEquals("comments property not initialized properly",
                 comments, lastOperation.getComments());
    assertEquals("timestamp property not initialized properly",
                 timestamp, lastOperation.getTimestamp());
    assertEquals("user property not initialized properly",
                 user, lastOperation.getUser());
    assertEquals("fromStatus property not initialized properly",
                 currentStatus, lastOperation.getFromStatus());

    currentStatus = approve ? currentStatus.getApprovalStatus() :
                         currentStatus.getRejectionStatus();

    assertEquals("toStatus property not initialized properly",
                 currentStatus, lastOperation.getToStatus());

    assertEquals("new approval status is incorrect", currentStatus.getId(),
                 project.getStatus().getId());

    return currentStatus;
  }
}
