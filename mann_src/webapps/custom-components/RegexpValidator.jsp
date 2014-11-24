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

<%@ page import="java.util.*"%>
<%@ page import="javax.faces.context.*"%>
<%@ page import="javax.faces.el.*"%>

<%
  FacesContext context = FacesContext.getCurrentInstance();
  context.getApplication().createValueBinding("#{sessionScope.emailExpression}").
          setValue(context, "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");

%>

<f:loadBundle basename="CustomComponentResources" var="bundle"/>

<html>
  <head>
    <title>JSF in Action - RegularExpression Custom Validator</title>
  </head>
  <style>
    .error { color: red; }
  </style>
  <body bgcolor="#ffffff">
    <h1>RegularExpression Validator</h1>

    <f:view>
      <h:form>
        <h:panelGrid columns="3">

          <h:outputLabel for="SSNInput">
            <h:outputText value="Enter a social security number:"/>
          </h:outputLabel>
          <h:inputText id="SSNInput">
            <jia:validateRegexp expression="\\d{3}[-]\\d{2}[-]\\d{4}"/>
          </h:inputText>
          <h:message for="SSNInput" styleClass="error"/>

          <h:outputLabel for="phoneInput">
            <h:outputText value="Enter a phone number:"/>
          </h:outputLabel>
          <h:inputText id="phoneInput" value="#{testForm.string}">
            <jia:validateRegexp expression="((\(\d{3}\)?)|(\d{3}-))?\d{3}-\d{4}"
                                errorMessage="Invalid phone number. Format is (###)###-####."/>
          </h:inputText>
          <h:message for="phoneInput" styleClass="error"/>

          <h:outputLabel for="emailInput">
            <h:outputText value="Enter an e-mail address:"/>
          </h:outputLabel>
          <h:inputText id="emailInput">
            <jia:validateRegexp expression="#{emailExpression}"
                                errorMessage="#{bundle.emailErrorMessage}"/>
          </h:inputText>
          <h:message for="emailInput" styleClass="error"/>
        </h:panelGrid>
        <h:commandButton value="Validate it!" style="margin-top: 10px"/>
      </h:form>
    </f:view>
  </body>
</html>
