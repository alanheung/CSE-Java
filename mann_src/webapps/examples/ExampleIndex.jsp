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
    <title>JSF in Action - Part 1 Examples</title>
    <h2>JSF in Action - Part 1 Examples</h2>
    <link rel="stylesheet" type="text/css" href="stylesheet.css"/>
  </head>
  <body>
    <f:view>
      <h:panelGrid columns="4" cellpadding="5" styleClass="table-background">

        <f:facet name="header">
          <h:outputLink value="ShowSource.jsp?filename=/WEB-INF/faces-config.xml">
            <h:outputText value="View faces-config.xml"/>
          </h:outputLink>
        </f:facet>

        <h:outputText value="Chapter" styleClass="table-header"/>
        <h:outputText value="Description" styleClass="table-header"/>
        <h:panelGroup/>
        <h:panelGroup/>

        <h:outputText value="3"/>
        <h:outputText value="Using JSTL with JSF - Example 1"/>
        <h:outputLink value="JSTL_1.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/JSTL_1.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="3"/>
        <h:outputText value="Using JSTL with JSF - Example 2"/>
        <h:outputLink value="JSTL_2.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/JSTL_2.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="3"/>
        <h:outputText value="Basic navigation"/>
        <h:outputLink value="Navigation.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/Navigation.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="4"/>
        <h:outputText value="UIViewRoot component"/>
        <h:outputLink value="UIViewRoot.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/UIViewRoot.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="4"/>
        <h:outputText value="Output family components"/>
        <h:outputLink value="OutputFamily.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/OutputFamily.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="4"/>
        <h:outputText value="HtmlGraphicImage component"/>
        <h:outputLink value="HtmlGraphicImage.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/HtmlGraphicImage.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="4"/>
        <h:outputText value="HtmlMessage component"/>
        <h:outputLink value="HtmlMessage.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/HtmlMessage.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="4"/>
        <h:outputText value="HtmlMessages component"/>
        <h:outputLink value="HtmlMessages.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/HtmlMessages.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="4"/>
        <h:outputText value="Panel family components"/>
        <h:outputLink value="PanelFamily.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/PanelFamily.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="5"/>
        <h:outputText value="Input family components"/>
        <h:outputLink value="InputFamily.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/InputFamily.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="5"/>
        <h:outputText value="HtmlSelectBooleanCheckbox component"/>
        <h:outputLink value="HtmlSelectBooleanCheckbox.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/HtmlSelectBooleanCheckbox.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="5"/>
        <h:outputText value="SelectMany family components"/>
        <h:outputLink value="SelectManyFamily.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/SelectManyFamily.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="5"/>
        <h:outputText value="SelectOne family components"/>
        <h:outputLink value="SelectOneFamily.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/SelectOneFamily.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="5"/>
        <h:outputText value="Command family components"/>
        <h:outputLink value="CommandFamily.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/CommandFamily.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="5"/>
        <h:outputText value="HtmlDataTable component"/>
        <h:outputLink value="HtmlDataTable.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/HtmlDataTable.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="6"/>
        <h:outputText value="Localization"/>
        <h:outputLink value="Localization.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/Localization.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="6"/>
        <h:outputText value="Validators"/>
        <h:outputLink value="Validators.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/Validators.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="6"/>
        <h:outputText value="Basic converters"/>
        <h:outputLink value="BasicConverters.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/BasicConverters.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="6"/>
        <h:outputText value="DateTime converter"/>
        <h:outputLink value="DateTimeConverter.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/DateTimeConverter.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <h:outputText value="6"/>
        <h:outputText value="Number converter"/>
        <h:outputLink value="NumberConverter.faces">
          <h:outputText value="View example"/>
        </h:outputLink>
        <h:outputLink value="ShowSource.jsp?filename=/NumberConverter.jsp">
          <h:outputText value="Example source"/>
        </h:outputLink>

        <f:facet name="footer">
          <h:outputText styleClass="small" value="These examples do not necessarily indicate best practices for building views -- see the ProjectTrack case study for an example of how to build a real application."/>
        </f:facet>

      </h:panelGrid>

    </f:view>
  </body>
</html>
