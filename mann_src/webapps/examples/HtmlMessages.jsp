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
	<title>JSF in Action - HtmlMessages example</title>
  <style>
   .errors { color: red }
  </style>
</head>
<body bgcolor="#ffffff">

<h1>HtmlMessages example</h1>

<f:view>
  <h:form>
    <h:panelGrid columns="2" border="1" cellspacing="0" cellpadding="10">
      <h:outputText value="Comments"/>
      <h:outputText value="Output"/>

      <h:outputText value='styleClass="errors"'/>
      <h:messages styleClass="errors"/>

      <h:outputText value='showDetail="true" showSummary="true" warnStyle="color: red"
                           infoClass="color: blue" globalOnly="true" layout="table"'/>
      <h:messages showDetail="true" showSummary="true" warnStyle="color: red"
                  infoStyle="color: blue" globalOnly="true" layout="table"/>
   </h:panelGrid>

    <h:outputLabel for="validatorInput">
      <h:outputText value="Enter text to create validator error messages:"/>
    </h:outputLabel>
		<h:inputText id="validatorInput">
      <f:validateLength minimum="0" maximum="3"/>
      <f:validateLongRange minimum="1" maximum="100"/>
    </h:inputText>

    <h:outputLabel for="messageCheckbox">
      <h:outputText value="Add global application messages?"/>
    </h:outputLabel>
    <h:selectBooleanCheckbox id="messageCheckbox" value="#{testForm.addMessages}"/>

    <h:commandButton value="Go!" actionListener="#{testForm.addMessages}"/>
  </h:form>
</f:view>

</body>
</html>
