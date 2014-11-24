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

package org.jia.validators;

import junit.framework.TestCase;

public class TestRegularExpressionValidator extends TestCase
{
  private RegularExpressionValidator regularExpressionValidator = null;

  protected void setUp() throws Exception
  {
    super.setUp();
    regularExpressionValidator = new RegularExpressionValidator();
  }

  protected void tearDown() throws Exception
  {
    regularExpressionValidator = null;
    super.tearDown();
  }

  protected void testIsValid(String expression, String value,
                             boolean expectedReturn)
  {
    regularExpressionValidator.setExpression(expression);
    boolean actualReturn = regularExpressionValidator.isValid(value);
    assertEquals("isValid returned", expectedReturn, actualReturn);
  }

  public void testIsValidCase1()
  {
    String expression = "[A-Z]*";
    String value = "abcdefg";
    boolean expectedReturn = false;
    testIsValid(expression, value, expectedReturn);
  }

  public void testIsValidCase2()
  {
    String expression = "((\\(\\d{3}\\)?)|(\\d{3}-))?\\d{3}-\\d{4}";
    String value = "(454)555-5555";
    boolean expectedReturn = true;
    testIsValid(expression, value, expectedReturn);

    value = "(454)4555-5555";
    expectedReturn = false;
    testIsValid(expression, value, expectedReturn);
  }

  public void testIsValidCase3()
  {
    String expression = "\\d{3}[-]\\d{2}[-]\\d{4}";
    String value = "555-55-5555";
    boolean expectedReturn = true;
    testIsValid(expression, value, expectedReturn);
  }
}
