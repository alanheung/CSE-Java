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

package org.jia.components.model;

import java.util.ArrayList;
import java.util.List;
import de.nava.informa.core.ChannelIF;
import de.nava.informa.impl.basic.ChannelBuilder;
import de.nava.informa.parsers.RSSParser;
import junit.framework.TestCase;

public class TestChannelDataModel extends TestCase
{
  protected ChannelDataModel channelDataModel = null;
  protected ChannelIF channel;
  protected List items;
  protected String testRssUrl = "http://www.javaserverfaces.com/jsfcentral.rss";

  protected void setUp() throws Exception
  {
    super.setUp();
    channelDataModel = new ChannelDataModel();
    channel = RSSParser.parse(new ChannelBuilder(), testRssUrl);
    items = new ArrayList(channel.getItems());
    channelDataModel.setWrappedData(channel);
  }

  protected void tearDown() throws Exception
  {
    channelDataModel = null;
    channel = null;
    super.tearDown();
  }

  public void testChannelDataModel()
  {
    channelDataModel = new ChannelDataModel(channel);
    ChannelIF channelProperty = (ChannelIF)channelDataModel.getWrappedData();
    assertTrue(channel.equals(channelProperty));

    boolean exceptionFound = false;
    try
    {
      channelDataModel = new ChannelDataModel(null);
    }
    catch (NullPointerException e) { exceptionFound = true; }
    assertTrue("No NullPointerException thrown", exceptionFound);
  }

  public void testGetRowCount()
  {
    int expectedReturn = items.size();
    int actualReturn = channelDataModel.getRowCount();
    assertEquals("return value", expectedReturn, actualReturn);

    channelDataModel.setWrappedData(null);
    boolean exceptionFound = false;
    try { channelDataModel.getRowCount(); }
    catch (IllegalStateException e) { exceptionFound = true; }
    assertTrue("IllegalStateException not thrown", exceptionFound);
  }

  public void testGetRowData()
  {
    for (int rowIndex = 0; rowIndex < items.size(); rowIndex++)
    {
      Object expectedReturn = items.get(rowIndex);
      channelDataModel.setRowIndex(rowIndex);
      Object actualReturn = channelDataModel.getRowData();
      assertEquals("return value (rowIndex " + rowIndex + ")",
                   expectedReturn, actualReturn);
    }
    boolean exceptionFound = false;
    channelDataModel.setWrappedData(null);
    try { channelDataModel.getRowData(); }
    catch (IllegalStateException e) { exceptionFound = true; }
    assertTrue("IllegalStateException not thrown", exceptionFound);
  }

  public void testGetRowIndex()
  {
    for (int rowIndex = 0; rowIndex < items.size(); rowIndex++)
    {
      channelDataModel.setRowIndex(rowIndex);
      int actualReturn = channelDataModel.getRowIndex();
      assertEquals("return value (rowIndex " + rowIndex + ")",
                   rowIndex, actualReturn);
    }
    channelDataModel.setWrappedData(null);
    boolean exceptionFound = false;
    try { channelDataModel.getRowIndex(); }
    catch (IllegalStateException e) { exceptionFound = true; }
    assertTrue("IllegalStateException not thrown", exceptionFound);
  }

  public void testGetWrappedData()
  {
    Object expectedReturn = channel;
    Object actualReturn = channelDataModel.getWrappedData();
    assertEquals("return value", expectedReturn, actualReturn);

    channelDataModel.setWrappedData(null);
    expectedReturn = null;
    actualReturn = channelDataModel.getWrappedData();
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testIsRowAvailable()
  {
    boolean expectedReturn = false;
    channelDataModel.setRowIndex(items.size());
    boolean actualReturn = channelDataModel.isRowAvailable();
    assertEquals("return value", expectedReturn, actualReturn);

    expectedReturn = false;
    channelDataModel.setRowIndex(-1);
    actualReturn = channelDataModel.isRowAvailable();
    assertEquals("return value", expectedReturn, actualReturn);

    expectedReturn = true;

    for (int rowIndex = 0; rowIndex < items.size(); rowIndex++)
    {
      channelDataModel.setRowIndex(rowIndex);
      actualReturn = channelDataModel.isRowAvailable();
      assertEquals("return value (rowIndex " + rowIndex + ")",
                   expectedReturn, actualReturn);
    }

    boolean exceptionFound = false;

    channelDataModel.setWrappedData(null);
    try { channelDataModel.isRowAvailable(); }
    catch (IllegalStateException e) { exceptionFound = true; }
    assertTrue("IllegalStateException not thrown", exceptionFound);
  }

  public void testSetRowIndex()
  {
    int rowIndex = 0;
    channelDataModel.setRowIndex(rowIndex);
    assertEquals("return value", rowIndex, channelDataModel.getRowIndex());

    boolean exceptionFound = false;
    try { channelDataModel.setRowIndex(-2); }
    catch (IllegalArgumentException e) { exceptionFound = true; }
    assertTrue("IllegalArgumentException not thrown", exceptionFound);

    try { channelDataModel.setRowIndex(items.size()); }
    catch (IllegalArgumentException e) { exceptionFound = true; }
    assertTrue("IllegalArgumentException not thrown", exceptionFound);

    channelDataModel.setWrappedData(null);
    try { channelDataModel.setRowIndex(rowIndex); }
    catch (IllegalStateException e) { exceptionFound = true; }
    assertTrue("IllegalStateException not thrown", exceptionFound);
  }

  public void testSetWrappedData()
  {
    Object data = null;
    channelDataModel.setWrappedData(data);
    assertEquals("return value", data, channelDataModel.getWrappedData());

    data = channel;
    channelDataModel.setWrappedData(data);
    assertEquals("return value", data, channelDataModel.getWrappedData());
  }

}
