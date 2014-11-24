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

<%@ page import="javax.faces.context.*"%>
<%@ page import="javax.faces.el.*"%>

<%
  FacesContext context = FacesContext.getCurrentInstance();
  context.getApplication().createValueBinding("#{sessionScope.rssLink}").
          setValue(context, "http://news.com.com/2547-1_3-0-20.xml");
%>

<html>
  <head>
    <title>JSF in Action - UIHeadlineViewer Custom Component</title>
  </head>
  <body bgcolor="#ffffff">
    <h1>UIHeadlineViewer</h1>

    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/headline_viewer.css"/>

    <f:view>
      <h:form>
        <h:panelGrid columns="3" cellpadding="3" columnClasses="table-column">

          <h:outputText value="Default display property values, limited to 5 rows"/>
          <h:outputText value="All display properties enabled, limited to 5 rows"/>
          <h:outputText value="Description visible, URL from value binding expression, no row limit"/>

          <jia:headlineViewerTable url="http://www.jsfcentral.com/jsfcentral.rss"
                                  styleClass="hviewer"
                                  channelTitleClass="hviewer-channel-title"
                                  itemTitleClass="hviewer-item-title"
                                  itemClasses="hviewer-item-even, hviewer-item-odd"
                                  rows="5"/>

          <jia:headlineViewerTable url="http://www.theserverside.com/rss/theserverside-1.0.rdf"
                                  showChannelTitle="#{testForm.trueProperty}"
                                  showItemTitle="#{testForm.trueProperty}"
                                  showItemCreator="#{testForm.trueProperty}"
                                  showItemPublishedDate="#{testForm.trueProperty}"
                                  showItemReceivedDate="#{testForm.trueProperty}"
                                  showItemDescription="#{testForm.trueProperty}"
                                  styleClass="hviewer"
                                  channelTitleClass="hviewer-channel-title"
                                  itemTitleClass="hviewer-item-title"
                                  itemHeaderClass="hviewer-item-header"
                                  itemDescriptionClass="hviewer-item-description"
                                  itemClasses="hviewer-item-even, hviewer-item-odd"
                                  rows="5"/>

          <jia:headlineViewerTable url="#{rssLink}"
                                  showItemDescription="true"
                                  styleClass="hviewer"
                                  channelTitleClass="hviewer-channel-title"
                                  itemTitleClass="hviewer-item-title"
                                  itemDescriptionClass="hviewer-item-description"
                                  itemClasses="hviewer-item-even, hviewer-item-odd"/>

         </h:panelGrid>
      </h:form>
    </f:view>
  </body>
</html>
