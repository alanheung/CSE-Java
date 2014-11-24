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

<jsp:useBean class="org.jia.ptrack.domain.User" id="lastNameUser" scope="session"/>
<jsp:useBean class="org.jia.ptrack.domain.User" id="firstNameLastNameUser" scope="session"/>
<jsp:useBean class="org.jia.ptrack.domain.User" id="lastNameFirstNameUser" scope="session"/>

<html>
  <head>
    <title>JSF in Action - User Custom Converter</title>
  </head>
  <style>
    .error { color: red; }
  </style>
  <body bgcolor="#ffffff">
    <h1>UserConverter</h1>

    <f:view>

      <h:panelGrid columns="1" cellpadding="3" cellspacing="5">
        <h:form>
          <h:panelGrid columns="2">
            <f:facet name="header">
              <h:message for="lastNameInput" styleClass="error"/>
            </f:facet>

            <h:outputText value="First name:"/>
            <h:outputText value="#{lastNameUser.firstName}"/>

            <h:outputText value="Last name:"/>
            <h:outputText value="#{lastNameUser.lastName}"/>

            <h:outputText value="Role:"/>
            <h:outputText value="#{lastNameUser.role}"/>

            <h:outputText value="Converted user:"/>
            <h:outputText value="#{lastNameUser}">
              <jia:userConverter style="lastName"/>
            </h:outputText>

            <h:outputLabel for="lastNameInput">
              <h:outputText value="Enter user name [lastName]:"/>
            </h:outputLabel>
            <h:inputText id="lastNameInput" value="#{lastNameUser}" size="30">
              <jia:userConverter style="lastName"/>
            </h:inputText>

          </h:panelGrid>
          <h:commandButton value="Convert it!" style="margin-top: 10px"/>
        </h:form>

        <h:form>
          <h:panelGrid columns="2">
            <f:facet name="header">
              <h:message for="firstNameLastNameInput" styleClass="error"/>
            </f:facet>

            <h:outputText value="First name:"/>
            <h:outputText value="#{firstNameLastNameUser.firstName}"/>

            <h:outputText value="Last name:"/>
            <h:outputText value="#{firstNameLastNameUser.lastName}"/>

            <h:outputText value="Role:"/>
            <h:outputText value="#{firstNameLastNameUser.role}"/>

            <h:outputText value="Converted user:"/>
            <h:outputText value="#{firstNameLastNameUser}">
              <jia:userConverter style="firstName_LastName"/>
            </h:outputText>

            <h:outputLabel for="firstNameLastNameInput">
              <h:outputText value="Enter user name [firstName lastName]:"/>
            </h:outputLabel>
            <h:inputText id="firstNameLastNameInput"
                          value="#{firstNameLastNameUser}" size="30">
              <jia:userConverter style="firstName_LastName"/>
            </h:inputText>
          </h:panelGrid>
          <h:commandButton value="Convert it!" style="margin-top: 10px"/>
        </h:form>

        <h:form>
          <h:panelGrid columns="2">
            <f:facet name="header">
              <h:message for="lastNameFirstNameInput" styleClass="error"/>
            </f:facet>

            <h:outputText value="First name:"/>
            <h:outputText value="#{lastNameFirstNameUser.firstName}"/>

            <h:outputText value="Last name:"/>
            <h:outputText value="#{lastNameFirstNameUser.lastName}"/>

            <h:outputText value="Role:"/>
            <h:outputText value="#{lastNameFirstNameUser.role}"/>

            <h:outputText value="Converted user:"/>
            <h:outputText value="#{lastNameFirstNameUser}">
              <jia:userConverter style="lastName_FirstName" showRole="true"/>
            </h:outputText>

            <h:outputLabel for="lastNameFirstNameInput">
              <h:outputText value="Enter user name [lastName firstName (Role)]:"/>
            </h:outputLabel>
            <h:inputText id="lastNameFirstNameInput"
                          value="#{lastNameFirstNameUser}" size="50">
              <jia:userConverter style="lastName_FirstName" showRole="true"/>
            </h:inputText>
          </h:panelGrid>

          <h:commandButton value="Convert it!" style="margin-top: 10px"/>

        </h:form>
      </h:panelGrid>
    </f:view>
  </body>
</html>
