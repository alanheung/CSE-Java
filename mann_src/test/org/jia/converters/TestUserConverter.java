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

package org.jia.converters;

import org.jia.ptrack.domain.RoleType;
import org.jia.ptrack.domain.User;

import javax.faces.application.FacesMessage;

import junit.framework.TestCase;

public class TestUserConverter extends TestCase
{
  private UserConverter userConverter = null;
  private User user = null;

  protected void setUp() throws Exception
  {
    super.setUp();
    userConverter = new UserConverter();
    user = new User("login", "firstName", "lastName", "foo",
                    RoleType.BUSINESS_ANALYST);
  }

  protected void tearDown() throws Exception
  {
    userConverter = null;
    super.tearDown();
  }

  public void testSymmetry()
  {
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME_LASTNAME);
    String firstName_lastName = userConverter.getUserAsString(user);
    User newUser = new User();
    userConverter.getStringAsUser(newUser, firstName_lastName);
    assertEquals("first name", user.getFirstName(), newUser.getFirstName());
    assertEquals("last name", user.getLastName(), newUser.getLastName());
  }

  public void testGetAsUser_FirstName()
  {
    String displayString = "Foo";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertEquals("return value", expectedReturn, actualReturn);
    assertEquals("first name", user.getFirstName(), displayString);
  }

  public void testGetAsUser_FirstName_Error()
  {
    String displayString = "Barr Foo";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertNotNull("return value", actualReturn);
    System.out.println(actualReturn.getSummary());
  }

  public void testGetAsUser_LastName()
  {
    String displayString = "Barr";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.LASTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertEquals("return value", expectedReturn, actualReturn);
    assertEquals("last name", user.getLastName(), displayString);
  }

  public void testGetAsUser_LastName_Error()
  {
    String displayString = "Barr Foo";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.LASTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertNotNull("return value", actualReturn);
    System.out.println(actualReturn.getSummary());
  }

  public void testGetAsUser_FirstNameLastName()
  {
    String displayString = "Foo Barr";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME_LASTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertEquals("return value", expectedReturn, actualReturn);
    assertEquals("first name", user.getFirstName(), "Foo");
    assertEquals("last name", user.getLastName(), "Barr");
  }

  public void testGetAsUser_FirstNameLastName_Role()
  {
    String displayString = "Foo Barr (Development Manager)";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME_LASTNAME);
    userConverter.setShowRole(true);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertEquals("return value", expectedReturn, actualReturn);
    assertEquals("first name", user.getFirstName(), "Foo");
    assertEquals("last name", user.getLastName(), "Barr");
    assertEquals("role", user.getRole(), RoleType.DEVELOPMENT_MANAGER);
  }

  public void testGetAsUser_FirstNameLastName_Error()
  {
    String displayString = "FooBarrBazz";
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME_LASTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertNotNull("return value", actualReturn);
    System.out.println(actualReturn.getSummary());
  }


  public void testGetAsUser_LastNameFirstName()
  {
    String displayString = "Barr, Foo";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.LASTNAME_FIRSTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertEquals("return value", expectedReturn, actualReturn);
    assertEquals("first name", user.getFirstName(), "Foo");
    assertEquals("last name", user.getLastName(), "Barr");
  }

  public void testGetAsUser_LastNameFirstName_Error()
  {
    String displayString = "Barr Foo";
    userConverter.setStyle(UserConverter.StyleType.LASTNAME_FIRSTNAME);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertNotNull("return value", actualReturn);
    System.out.println(actualReturn.getSummary());
  }

  public void testGetAsUser_Role()
  {
    String displayString = "Foo (Development Manager)";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    userConverter.setShowRole(true);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertEquals("return value", expectedReturn, actualReturn);
    assertEquals("role", user.getRole().getDescription(), "Development Manager");
  }

  public void testGetAsUser_Role_Error()
  {
    String displayString = "Foo Development Manager)";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    userConverter.setShowRole(true);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertNotNull("return value", actualReturn);
    System.out.println(actualReturn.getSummary());
  }

  public void testGetAsUser_Role_Error_2()
  {
    String displayString = "Foo (development Manager)";
    FacesMessage expectedReturn = null;
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    userConverter.setShowRole(true);
    FacesMessage actualReturn = userConverter.getStringAsUser(user, displayString);
    assertNotNull("return value", actualReturn);
    System.out.println(actualReturn.getSummary());
  }


  public void testGetUserAsString_FirstName()
  {
    String expectedReturn = user.getFirstName();
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_FirstName_Null()
  {
    user.setFirstName(null);
    String expectedReturn = "";
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_LastName()
  {
    String expectedReturn = user.getLastName();
    userConverter.setStyle(UserConverter.StyleType.LASTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_LastName_Null()
  {
    user.setLastName(null);
    String expectedReturn = "";
    userConverter.setStyle(UserConverter.StyleType.LASTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_FirstNameLastName()
  {
    String expectedReturn = user.getFirstName() + " " + user.getLastName();
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME_LASTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_FirstNameLastName_Null()
  {
    user.setFirstName(null);
    String expectedReturn = user.getLastName();
    userConverter.setStyle(UserConverter.StyleType.FIRSTNAME_LASTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_LastNameFirstName()
  {
    String expectedReturn = user.getLastName() + ", " + user.getFirstName();
    userConverter.setStyle(UserConverter.StyleType.LASTNAME_FIRSTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_LastNameFirstName_Null()
  {
    user.setLastName(null);
    String expectedReturn = user.getFirstName();
    userConverter.setStyle(UserConverter.StyleType.LASTNAME_FIRSTNAME);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_Role()
  {
    String expectedReturn = user.getLastName() + ", " + user.getFirstName() +
                            " (" + user.getRole().getDescription() + ")";
    userConverter.setStyle(UserConverter.StyleType.LASTNAME_FIRSTNAME);
    userConverter.setShowRole(true);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testGetUserAsString_Role_Null()
  {
    user.setRole(null);
    String expectedReturn = user.getLastName() + ", " + user.getFirstName();
    userConverter.setStyle(UserConverter.StyleType.LASTNAME_FIRSTNAME);
    userConverter.setShowRole(true);
    String actualReturn = userConverter.getUserAsString(user);
    assertEquals("return value", expectedReturn, actualReturn);
  }

}
