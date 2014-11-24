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

import junit.framework.*;
import org.jia.ptrack.domain.*;
import java.util.Iterator;

public class TestArtifactTypeConverter extends TestCase
{
  private ArtifactTypeConverter artifactTypeConverter = null;

  protected void setUp() throws Exception
  {
    super.setUp();
    artifactTypeConverter = new ArtifactTypeConverter();
  }

  protected void tearDown() throws Exception
  {
    artifactTypeConverter = null;
    super.tearDown();
  }

  public void testGetArtifactTypeAsString()
  {
    Iterator types = ArtifactType.getEnumManager().getInstances().iterator();
    while (types.hasNext())
    {
      ArtifactType currentType = (ArtifactType)types.next();
      String expectedReturn = String.valueOf(currentType.getValue());
      String actualReturn = artifactTypeConverter.
                             getArtifactTypeAsString(currentType);
      assertEquals("return value", expectedReturn, actualReturn);
    }
  }

  public void testGetStringAsArtifactType() throws NumberFormatException,
      IllegalArgumentException
  {
    Iterator types = ArtifactType.getEnumManager().getInstances().iterator();
    while (types.hasNext())
    {
      ArtifactType currentType = (ArtifactType)types.next();
      ArtifactType expectedReturn = currentType;
      ArtifactType actualReturn = artifactTypeConverter.
                             getStringAsArtifactType(String.valueOf(currentType.getValue()));
      assertEquals("return value", expectedReturn, actualReturn);
    }
  }

}
