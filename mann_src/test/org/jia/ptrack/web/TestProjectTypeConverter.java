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

package org.jia.ptrack.web;

import java.util.Iterator;

import org.jia.ptrack.domain.ProjectType;
import junit.framework.TestCase;

public class TestProjectTypeConverter extends TestCase
{
  private ProjectTypeConverter ProjectTypeConverter = null;

  protected void setUp() throws Exception
  {
    super.setUp();
    ProjectTypeConverter = new ProjectTypeConverter();
  }

  protected void tearDown() throws Exception
  {
    ProjectTypeConverter = null;
    super.tearDown();
  }

  public void testGetProjectTypeAsString()
  {
    Iterator types = ProjectType.getEnumManager().getInstances().iterator();
    while (types.hasNext())
    {
      ProjectType currentType = (ProjectType)types.next();
      String expectedReturn = String.valueOf(currentType.getValue());
      String actualReturn = ProjectTypeConverter.
                             getProjectTypeAsString(currentType);
      assertEquals("return value", expectedReturn, actualReturn);
    }
  }

  public void testGetStringAsProjectType() throws NumberFormatException,
      IllegalArgumentException
  {
    Iterator types = ProjectType.getEnumManager().getInstances().iterator();
    while (types.hasNext())
    {
      ProjectType currentType = (ProjectType)types.next();
      ProjectType expectedReturn = currentType;
      ProjectType actualReturn = ProjectTypeConverter.
                             getStringAsProjectType(String.valueOf(currentType.getValue()));
      assertEquals("return value", expectedReturn, actualReturn);
    }
  }

}
