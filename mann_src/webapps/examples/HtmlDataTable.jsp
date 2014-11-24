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
  <title>JSF in Action - HtmlDataTable examples</title>
  <link rel="stylesheet" type="text/css" href="stylesheet.css"/>
</head>

<body>

<h1>HtmlDataTable examples</h1>

<f:view>
 <h:form>
   <h:panelGrid columns="2" border="1" cellspacing="0" cellpadding="5">
     <h:outputText value="Comments"/>
     <h:outputText value="Output"/>

     <h:outputText value="Basic read-only usage."/>
     <h:dataTable value="#{userList}" var="user" border="1" cellspacing="2">
       <h:column>
         <f:facet name="header">
           <h:outputText value="First Name"/>
         </f:facet>
         <h:outputText value="#{user.firstName}"/>
       </h:column>
       <h:column>
         <f:facet name="header">
           <h:outputText value="Last Name"/>
         </f:facet>
         <h:outputText value="#{user.lastName}"/>
       </h:column>
       <h:column>
         <f:facet name="header">
           <h:outputText value="Balance"/>
         </f:facet>
         <h:outputText value="#{user.balance}">
           <f:convertNumber type="currency"/>
         </h:outputText>
       </h:column>
     </h:dataTable>

     <h:outputText value="Usage with edit components and styles."/>
     <h:dataTable value="#{userList}" var="user" styleClass="table-background"
                  headerClass="headers" footerClass="table-footer"
                  rowClasses="table-odd-row, table-even-row"
                  cellspacing="5" cellpadding="5"
                  binding="#{testForm.testTable}">
       <f:facet name="header">
         <h:outputText value="Edit user information" styleClass="table-header"/>
       </f:facet>
       <h:column>
         <f:facet name="header">
           <h:outputText value="First Name"/>
         </f:facet>
         <h:inputText id="inputName" value="#{user.firstName}"/>
       </h:column>
       <h:column>
         <f:facet name="header">
           <h:outputText value="Last Name"/>
         </f:facet>
         <h:inputText value="#{user.lastName}"/>
       </h:column>
       <h:column>
         <f:facet name="header">
           <h:outputText value="Balance"/>
         </f:facet>
         <h:inputText value="#{user.balance}">
           <f:convertNumber type="currency"/>
         </h:inputText>
       </h:column>
       <h:column>
         <f:facet name="header">
           <h:outputText value="Registered?"/>
         </f:facet>
         <h:outputText value="#{user.registered}"/>
       </h:column>
       <h:column>
         <h:commandLink actionListener="#{testForm.deleteUser}">
           <h:outputText value="Delete"/>
         </h:commandLink>
       </h:column>
       <f:facet name="footer">
        <h:panelGroup>
           <h:commandButton value="Submit"/>
           <h:commandButton value="Reset" type="reset"/>
        </h:panelGroup>
       </f:facet>
    </h:dataTable>
   </h:panelGrid>
 </h:form>
</f:view>

</body>
</head>
