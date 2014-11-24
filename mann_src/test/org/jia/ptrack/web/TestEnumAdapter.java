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

import org.jia.ptrack.domain.*;

import junit.framework.*;
import javax.faces.model.SelectItem;
import java.util.*;

public class TestEnumAdapter extends TestCase
{
  EnumItemAdapter enumAdapter;

  public TestEnumAdapter(String s)
  {
    super(s);
  }

  protected void setUp()
  {
    enumAdapter = new EnumItemAdapter();
  }

  protected void tearDown()
  {
  }

  protected void compareList(List selectItemList, Collection instances)
  {
    int count = 0;
    Iterator items = selectItemList.iterator();
    while (items.hasNext())
    {
      SelectItem item = (SelectItem)items.next();
      Iterator types = instances.iterator();
      while (types.hasNext())
      {
        EnumeratedType type = (EnumeratedType)types.next();
        if ((type.getValue() == ((EnumeratedType)item.getValue()).getValue()) &&
            (type.getDescription().equals(item.getDescription())) &&
            (type.getDescription().equals(item.getLabel())))
        {
          count++;
        }
      }
    }
   assertEquals("Not enough matching instances", instances.size(), count);
  }

  public void testGetArtifacts()
  {
    compareList(enumAdapter.getArtifacts(),
                ArtifactType.getEnumManager().getInstances());
  }

  public void testGetRoles()
  {
    compareList(enumAdapter.getRoles(),
                RoleType.getEnumManager().getInstances());
  }

  public void testGetProjectTypes()
  {
    compareList(enumAdapter.getProjectTypes(),
                ProjectType.getEnumManager().getInstances());
  }

}
