<%--
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

--%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
  <head>
    <title>JSF in Action - Custom Component, Converter, and Validator Examples</title>
    <h2>JSF in Action - Custom Component Component, Converter, and Validator Examples</h2>
    <link rel="stylesheet" type="text/css" href="stylesheet.css"/>
  </head>
  <body>
    <f:view>
      <h:panelGrid columns="5" cellpadding="5" styleClass="table-background">

        <h:outputText value="Name" styleClass="table-header"/>
        <h:outputText value="UI Extension Type" styleClass="table-header"/>
        <h:outputText value="Description" styleClass="table-header"/>
        <h:panelGroup/>
        <h:panelGroup/>

        <h:outputText value="UIInputDate"/>
        <h:outputText value="UI Component"/>
        <h:outputText value="Date input control with drop-down list boxes."/>
        <h:outputLink value="faces/UIInputDate.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/UIInputDate.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="RolloverButton"/>
        <h:outputText value="Renderer"/>
        <h:outputText value="Displays a UICommand as an image button with a JavaScript rollover effect."/>
        <h:outputLink value="faces/RolloverButtonRenderer.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/RolloverButtonRenderer.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="RolloverButtonDecorator"/>
        <h:outputText value="Renderer"/>
        <h:outputText value="Performs the same function as RolloverButton renderer by decorating the standard Button renderer."/>
        <h:outputLink value="faces/RolloverButtonDecoratorRenderer.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/RolloverButtonDecoratorRenderer.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="UIHeadlineViewer"/>
        <h:outputText value="UI Component"/>
        <h:outputText value="Displays headlines gathered from an RSS feed."/>
        <h:outputLink value="faces/UIHeadlineViewer.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/UIHeadlineViewer.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="UINavigator"/>
        <h:outputText value="UI Component"/>
        <h:outputText value="Displays a set of links with graphics for use as a toolbar-like navigation bar."/>
        <h:outputLink value="faces/UINavigator.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/UINavigator.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="RegularExpression"/>
        <h:outputText value="Validator"/>
        <h:outputText value="Validates a string based on a regular expression."/>
        <h:outputLink value="faces/RegexpValidator.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/RegexpValidator.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="User"/>
        <h:outputText value="Converter"/>
        <h:outputText value="Converts a User object to and from a String."/>
        <h:outputLink value="faces/UserConverter.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/UserConverter.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="UIDebug"/>
        <h:outputText value="UI Component"/>
        <h:outputText value="Displays debugging information about the web application's current state (not covered in the book)."/>
        <h:outputLink value="faces/UIDebug.jsp">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/UIDebug.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <f:facet name="footer">
          <h:outputText styleClass="small" value="The scriptlets and JSP <usebean> tags in these examples do not necessarily indicate best practices -- see the ProjectTrack case study for how to build a real application."/>
        </f:facet>

      </h:panelGrid>

    </f:view>
  </body>
</html>
