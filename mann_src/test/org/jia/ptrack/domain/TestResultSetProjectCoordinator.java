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

import java.sql.ResultSet;

import junit.framework.TestCase;

public class TestResultSetProjectCoordinator extends TestCase
{
  private ResultSetProjectCoordinator resultSetProjectCoordinator = null;

  protected void setUp() throws Exception
  {
    super.setUp();
    resultSetProjectCoordinator = new ResultSetProjectCoordinator(
//        "jdbc:hsqldb:res:DATASET",
        "jdbc:hsqldb:C:/Documents and Settings/kito/My Documents/Projects/JSF In Action/Examples/webapps/ptrack/WEB-INF/DATASET",
        "sa", "");
  }

  protected void tearDown() throws Exception
  {
    resultSetProjectCoordinator.shutdown();
    resultSetProjectCoordinator = null;
    super.tearDown();
  }

  public void testGetProjects() throws Exception
  {
    ResultSet results = resultSetProjectCoordinator.getProjects();
    assertTrue(String.valueOf(results.getType()),
               results.getType() == ResultSet.TYPE_SCROLL_INSENSITIVE);
    assertTrue("Column: id",
               results.getMetaData().getColumnName(1).equalsIgnoreCase("id"));
    assertTrue("Column: name",
               results.getMetaData().getColumnName(2).equalsIgnoreCase("name"));
    assertTrue("Column: type",
               results.getMetaData().getColumnName(3).equalsIgnoreCase("type"));
    assertTrue("Column: status",
               results.getMetaData().getColumnName(4).equalsIgnoreCase("status"));
    assertTrue("Column: waitingFor",
               results.getMetaData().getColumnName(5).
               equalsIgnoreCase("waitingFor"));

    while (results.next())
    {
      System.out.print(results.getString("id") + ", ");
      System.out.print(results.getString("name") + ", ");
      System.out.print(results.getString("type") + ", ");
      System.out.print(results.getString("status") + ", ");
      System.out.println(results.getString("waitingfor"));
    }
    results.close();
  }

  public void testGetProjectsByRole() throws Exception
  {
    ResultSet results = resultSetProjectCoordinator.getProjects(RoleType.
        PROJECT_MANAGER);
    assertTrue(String.valueOf(results.getType()),
               results.getType() == ResultSet.TYPE_SCROLL_INSENSITIVE);
    assertTrue("Column: id",
               results.getMetaData().getColumnName(1).equalsIgnoreCase("id"));
    assertTrue("Column: name",
               results.getMetaData().getColumnName(2).equalsIgnoreCase("name"));
    assertTrue("Column: type",
               results.getMetaData().getColumnName(3).equalsIgnoreCase("type"));
    assertTrue("Column: status",
               results.getMetaData().getColumnName(4).equalsIgnoreCase("status"));
    assertTrue("Column: waitingFor",
               results.getMetaData().getColumnName(5).
               equalsIgnoreCase("waitingFor"));

    while (results.next())
    {
      System.out.print(results.getString("id") + ", ");
      System.out.print(results.getString("name") + ", ");
      System.out.print(results.getString("type") + ", ");
      System.out.print(results.getString("status") + ", ");
      System.out.println(results.getString("waitingfor"));
      assertTrue(results.getString("waitingfor").equals(RoleType.
                                                        PROJECT_MANAGER.
                                                        toString()));
    }
    results.close();
  }

  public void testShutdown() throws DataStoreException, Exception
  {
    resultSetProjectCoordinator.shutdown();
  }
}
