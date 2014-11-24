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

public class TestStatusCoordinator extends TestCase
{
  private MemoryStatusCoordinator statusCoordinator;

  public TestStatusCoordinator(String s)
  {
    super(s);
  }

  protected void setUp()
  {
    statusCoordinator = new MemoryStatusCoordinator();
  }

  protected void tearDown()
  {
  }

  public void testGetInitialStatus()
  {
    IStatus status = statusCoordinator.getInitialStatus();
    checkStatus(status, true, false);
    status = status.getApprovalStatus();
    while (!status.getApprovalStatus().equals(status))
    {
      checkStatus(status, false, false);
      status = status.getApprovalStatus();
    }
    checkStatus(status, false, true);
  }

  protected void checkStatus(IStatus status, boolean isInitialState,
                             boolean isFinalState)
  {
    assertEquals(status.getName() + ": initialState property",
                 status.isInitialState(),
                 isInitialState);
    assertNotNull(status.getName() + ": rejectionStatus",
                  status.getRejectionStatus());
    assertNotNull(status.getName() + ": approvalStatus",
                  status.getApprovalStatus());
    assertEquals(status.getName() + ": endState property", status.isFinalState(),
                 isFinalState);
  }
}
