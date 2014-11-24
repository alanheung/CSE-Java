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

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="jsf-in-action-components" prefix="jia" %>

<%@ page import="org.jia.components.model.*"%>
<%@ page import="org.jia.util.*"%>
<%@ page import="javax.faces.context.*"%>
<%@ page import="javax.faces.el.*"%>

<html>
  <head>
    <title>JSF in Action - UINavigator Custom Component and
           Toolbar Custom Renderer</title>
    <link rel="stylesheet" type="text/css"
          href="<%= request.getContextPath()%>/navigator.css"/>
  </head>
  <body bgcolor="#ffffff">
  <h1>UINavigator with Toolbar Renderer</h1>
  <h3>Second page</h3>
  <f:view>
    <h:form id="mainForm">
      <h:panelGrid border="1" columns="2" cellspacing="0" cellpadding="4"
                    columnClasses="column">

        <h:outputText styleClass="header" value="Comments"/>
        <h:outputText styleClass="header" value="Output"/>

        <h:outputText value="Vertical layout; uses value binding for item list
                             (configured in code and stored in session);
                             all items execute a single Action that navigates
                             to next page"/>
        <jia:navigatorToolbar id="nav1" layout="VERTICAL"
                               styleClass="navigator2"
                               itemClass="navigator-command"
                               selectedItemClass="navigator-selected-command"
                               headerClass="navigator-title"
                               iconClass="navigator-command-icon"
                               value="#{items}"  headerLabel="ProjectTrack:"/>
<%--
        <h:outputText value="Horizontal layout; item list configured via tags
                              (one item disabled);
                              all items execute a single Action method that
                              increments a counter"/>
        <jia:navigatorToolbar id="nav2" layout="horizontal"
                               styleClass="navigator2"
 							   itemClass="navigator-command"
                               selectedItemClass="navigator-selected-command"
                               headerClass="navigator-title"
                               iconClass="navigator-command-icon">
          <f:facet name="header">
            <h:outputText value="ProjectTrack:"/>
          </f:facet>
        </jia:navigatorToolbar>

      <h:outputText value="Vertical layout; item list configured via tags;
                            items execute differnet actions and
                            reference external links; action listener registered
                            for logging"/>
      <jia:navigatorToolbar id="nav3" layout="vertical" styleClass="navigator2"
                             itemClass="navigator-selected-command"
                             selectedItemClass="navigator-command"
                             headerClass="navigator-title"
                             iconClass="navigator-command-icon">
        <f:facet name="header">
          <h:outputText value="UINavigator Demo"/>
        </f:facet>
        <f:actionListener type="org.jia.components.NavigatorLoggingActionListener"/>
      </jia:navigatorToolbar>
--%>
     </h:panelGrid>
    </h:form>
    <h:panelGrid columns="2" cellpadding="2">
      <h:outputText style="font-weight: bold"
                     value="Property modified by action:"/>
      <h:outputText value="testForm.counter: #{testForm.counter}"/>
      <h:outputText style="font-weight: bold"
                     value="Message set by logging action listener:"/>
      <h:outputText value="#{testForm.loggingMessage}"/>
    </h:panelGrid>
</f:view>
</body>
</html>
