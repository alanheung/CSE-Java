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

import java.util.*;

import junit.framework.TestCase;

public class TestProjectCoordinator extends TestCase
{
  MemoryProjectCoordinator projectCoordinator;
  IStatus initialStatus;

  public TestProjectCoordinator(String s)
  {
    super(s);
  }

  protected void setUp() throws DataStoreException
  {
    projectCoordinator = new MemoryProjectCoordinator();
    projectCoordinator.removeAll();
    MemoryStatusCoordinator statusCoordinator = new MemoryStatusCoordinator();
    initialStatus = statusCoordinator.getInitialStatus();
  }

  protected void tearDown()
  {
  }

  public void testAddProject() throws DataStoreException
  {
    Project project = new Project(initialStatus);
    project.setName("foo");
    project.setType(ProjectType.EXTERNAL_DB);
    projectCoordinator.add(project);
    assertTrue("Project not found", projectCoordinator.get("0") == project);
  }

  public void testRemoveProject() throws DataStoreException
  {
    List testProjects = addTestProjects();

    Iterator projects = testProjects.iterator();
    while (projects.hasNext())
    {
      Project current = (Project) projects.next();
      projectCoordinator.remove(current.getId());

      boolean removed = false;
      try
      {
        projectCoordinator.get(current.getId());
      }
      catch (ObjectNotFoundException e)
      {
        removed = true;
      }
      assertTrue("Project not removed", removed);

      projects.remove();
    }
    assertTrue("All projects not removed", testProjects.isEmpty());
  }

  public void testRemoveAll() throws DataStoreException
  {
    List testProjects = addTestProjects();
    projectCoordinator.removeAll();

    Iterator projects = testProjects.iterator();
    while (projects.hasNext())
    {
      Project current = (Project) projects.next();
      boolean removed = false;
      try
      {
        projectCoordinator.get(current.getId());
      }
      catch (ObjectNotFoundException e)
      {
        removed = true;
      }
      assertTrue("Project found (should have been deleted)", removed);
      projects.remove();
    }
    assertTrue("All projects not removed", testProjects.isEmpty());
  }

  public void testGetProjects() throws DataStoreException
  {
    boolean found = true;
    try
    {
      projectCoordinator.getProjects();
    }
    catch (ObjectNotFoundException e)
    {
      found = false;
    }
    assertTrue("Unexpected projects found", !found);

    List testProjects = addTestProjects();
    Iterator projects = projectCoordinator.getProjects().iterator();
    while (projects.hasNext())
    {
      Project current = (Project) projects.next();
      assertTrue("Project not found", testProjects.remove(current));
    }
    assertTrue("All projects not found", testProjects.isEmpty());
  }

  public void testGetProject() throws DataStoreException
  {
    boolean found = true;
    try
    {
      projectCoordinator.get("-99999");
    }
    catch (ObjectNotFoundException e)
    {
      found = false;
    }
    assertTrue("Unexpected project found", !found);

    List testProjects = addTestProjects();
    Iterator projects = testProjects.iterator();
    while (projects.hasNext())
    {
      Project original = (Project) projects.next();
      Project current = projectCoordinator.get(original.getId());

      assertTrue("Projects not equal", original.equals(current));
    }
  }

  public void testGetProjectsByRole() throws DataStoreException
  {
    projectCoordinator.removeAll();

    ArrayList projManager = new ArrayList();
    ArrayList devManager = new ArrayList();
    ArrayList sysManager = new ArrayList();
    ArrayList qaManager = new ArrayList();

    Project project = new Project(initialStatus);
    project.setId("01");
    project.setName("foo");
    project.setType(ProjectType.EXTERNAL_DB);
    projManager.add(project);
    projectCoordinator.add(project);

    project = new Project(initialStatus);
    project.setId("02");
    project.setName("foo");
    project.setType(ProjectType.EXTERNAL_WEB);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    devManager.add(project);
    projectCoordinator.add(project);

    project = new Project(initialStatus);
    project.setId("03");
    project.setName("foo");
    //project.setDescription("description");
    project.setType(ProjectType.INTERANL_DB);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    sysManager.add(project);
    projectCoordinator.add(project);

    project = new Project(initialStatus);
    project.setId("04");
    project.setName("foo");
    project.setType(ProjectType.INTERANL_DB);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    sysManager.add(project);
    projectCoordinator.add(project);

    checkProjectList(RoleType.PROJECT_MANAGER, projManager);
    checkProjectList(RoleType.DEVELOPMENT_MANAGER, devManager);
    checkProjectList(RoleType.SYSTEMS_MANAGER, sysManager);

    project.changeStatus(true, null, null);
    sysManager.remove(project);
    projectCoordinator.update(project);
    checkProjectList(RoleType.SYSTEMS_MANAGER, sysManager);

    qaManager.add(project);
    checkProjectList(RoleType.QA_MANAGER, qaManager);

    boolean found = true;
    try
    {
      projectCoordinator.getProjects(RoleType.BUSINESS_ANALYST);
    }
    catch (ObjectNotFoundException e)
    {
      found = false;
    }
    assertTrue("Unexpected project found", !found);
  }

  protected void checkProjectList(RoleType role, ArrayList projectList) throws
      DataStoreException
  {
    List removelList = (ArrayList) projectList.clone();
    Iterator projects = projectCoordinator.getProjects(role).iterator();
    while (projects.hasNext())
    {
      Project current = (Project) projects.next();
      System.out.println(current.getId());
      assertTrue("Project not found", removelList.remove(current));
    }
    assertTrue("All projects not found", removelList.isEmpty());
  }

  protected List addTestProjects() throws DataStoreException
  {
    List testProjects = new ArrayList();
    Project project = new Project(initialStatus);
    project.setId("01");
    project.setName("foo");
    project.setType(ProjectType.EXTERNAL_DB);
    testProjects.add(project);
    projectCoordinator.add(project);

    project = new Project(initialStatus);
    project.setId("02");
    project.setName("foo");
    project.setType(ProjectType.EXTERNAL_WEB);
    testProjects.add(project);
    projectCoordinator.add(project);

    project = new Project(initialStatus);
    project.setId("03");
    project.setName("foo");
    project.setType(ProjectType.INTERANL_DB);
    testProjects.add(project);
    projectCoordinator.add(project);

    return testProjects;
  }

  public void testUpdate() throws DataStoreException
  {
    Project project = null;
    List testProjects = addTestProjects();

    project = (Project) testProjects.get(1);
    project.setId("-999999999");
    boolean found = true;
    try
    {
      project = projectCoordinator.get("-99999xxafdf");
    }
    catch (ObjectNotFoundException e)
    {
      found = false;
    }
    assertTrue("Project should have not have been found", !found);

    project = (Project) testProjects.get(1);
    project.setId("99999");
    project.setName("foobar");
    projectCoordinator.update(project);
    assertTrue("Project with updated id not found",
               project.equals(projectCoordinator.get("99999")));

    project.changeStatus(true, null, null);
    projectCoordinator.update(project);
    assertTrue("Status change update not okay",
               numInstances(projectCoordinator.getProjects(RoleType.
                                                           PROJECT_MANAGER),
                            project) == 1);

    project.changeStatus(true, null, null);
    project.changeStatus(true, null, null);
    projectCoordinator.update(project);
    assertTrue("Status change update not okay",
               numInstances(projectCoordinator.getProjects(RoleType.
                                                           DEVELOPMENT_MANAGER),
                            project) == 1);
  }

  public int numInstances(Collection collection, Object object)
  {
    Iterator iterator = collection.iterator();
    int count = 0;
    while (iterator.hasNext())
    {
      if (object.equals(iterator.next()))
      {
        count++;
      }
    }
    return count;
  }

}
