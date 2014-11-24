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
    <title>
      JSF in Action - Panel family examples
    </title>
    <link rel="stylesheet" type="text/css"
       href="stylesheet.css"/>
  </head>

<body>

<h1>Panel family examples</h1>

<f:view>
<h:messages/>
  <h:form >
    <table border="1" cellspacing="0" cellpadding="10">
     <tr>
       <td>
         <b>Component</b>
       </td>
       <td>
         <b>Comments</b>
       </td>
       <td>
         <b>Output</b>
       </td>
     </tr>
     <tr>
       <td>
         HtmlPanelGroup
       </td>
       <td>Adds no rendering behavior<br>
           Child HtmlGraphicImage and HtmlOutputText components.
       </td>
       <td>
         <h:panelGroup>
          <h:graphicImage url="images/inbox.gif"/>
          <h:outputText value="Column 1"/>
          <h:outputText value="Column 2"/>
         </h:panelGroup>
       </td>
     </tr>
     <tr>
       <td>
         HtmlPanelGroup
       </td>
       <td>styleClass="table-background"<br>
           Child HtmlGraphicImage and HtmlOutputText components.
       </td>
       <td>
         <h:panelGroup id="myGroup" styleClass="table-background">
          <h:graphicImage url="images/inbox.gif"/>
          <h:outputText value="Column 1"/>
          <h:outputText value="Column 2"/>
         </h:panelGroup>
       </td>
     </tr>
    <tr>
       <td>
         HtmlPanelGrid
       </td>
       <td>columns="3" cellpadding="1" border="1" width="40%"<br>
           Child HtmlOutputText components.
       </td>
       <td>
         <h:panelGrid columns="3" cellpadding="1" border="1" width="40%">
           <h:outputText value="(1,1)"/>
           <h:outputText value="(1,2)"/>
           <h:outputText value="(1,3)"/>
           <h:outputText value="(2,1)"/>
           <h:outputText value="(2,2)"/>
           <h:outputText value="(2,3)"/>
         </h:panelGrid>
       </td>
     </tr>
     <tr>
       <td>
         HtmlPanelGrid
       </td>
       <td>columns="4" styleClass="table-background"<br>
           headerClass="page-header"<br>
           columnClasses="table-odd-column, table-even-column"<br>
           footerClass="table-footer"<br>
           cellpadding="1" border="1" width="40%"<br>
           With header and footer facets and child HtmlOutputText components.
       </td>
       <td>
        <h:panelGrid columns="4" styleClass="table-background"
                     headerClass="page-header"
                     columnClasses="table-odd-column, table-even-column"
                     footerClass="table-footer"
                     cellpadding="1" border="1" width="40%">

         <f:facet name="header">
           <h:panelGroup>
             <h:graphicImage url="images/inbox.gif"/>
             <h:outputText value="This is a sample header."/>
           </h:panelGroup>
         </f:facet>
         <h:outputText value="(1,1)"/>
         <h:outputText value="(1,2)"/>
         <h:outputText value="(1,3)"/>
         <h:outputText value="(1,4)"/>
         <h:outputText value="(2,1)"/>
         <h:outputText value="(2,2)"/>
         <h:outputText value="(2,3)"/>
         <h:outputText value="(2,4)"/>
         <h:outputText value="(3,1)"/>
         <h:outputText value="(3,2)"/>
         <h:outputText value="(3,3)"/>
         <h:outputText value="(3,4)"/>
         <f:facet name="footer">
           <h:outputText value="This is the footer."/>
         </f:facet>
        </h:panelGrid>
       </td>
     </tr>
     <tr>
       <td>
         HtmlPanelGrid
       </td>
       <td>columns="4"<br>
           headerClass="page-header extra-border"<br>
           columnClasses="table-odd-column extra-border, <br>
             table-even-column, table-even-column extra-border, table-even-column"<br>
           rowClasses="table-header"<br>
           footerClass="table-footer"<br>
           cellpadding="1" border="1" width="40%"<br>
           With header and footer facets, and child HtmlOutputText components.
       </td>
       <td>
        <h:panelGrid columns="4"
                     headerClass="page-header extra-border"
                     columnClasses="table-odd-column extra-border, table-even-column, table-even-column extra-border, table-even-column"
                     rowClasses="table-header"
                     footerClass="table-footer"
                     cellpadding="1" border="1" width="40%">

         <f:facet name="header">
           <h:panelGroup>
             <h:graphicImage url="images/inbox.gif"/>
             <h:outputText value="This is a sample header."/>
           </h:panelGroup>
         </f:facet>
         <h:outputText value="(1,1)"/>
         <h:outputText value="(1,2)"/>
         <h:outputText value="(1,3)"/>
         <h:outputText value="(1,4)"/>
         <h:outputText value="(2,1)"/>
         <h:outputText value="(2,2)"/>
         <h:outputText value="(2,3)"/>
         <h:outputText value="(2,4)"/>
         <h:outputText value="(3,1)"/>
         <h:outputText value="(3,2)"/>
         <h:outputText value="(3,3)"/>
         <h:outputText value="(3,4)"/>
         <f:facet name="footer">
           <h:outputText value="This is the footer."/>
         </f:facet>
        </h:panelGrid>
       </td>
     </tr>
    </table>
  </h:form>
</f:view>

</body>
</html>
