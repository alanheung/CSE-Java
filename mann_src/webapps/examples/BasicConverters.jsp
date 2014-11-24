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
  <title>JSF in Action - Basic converter examples</title>
  <style>
   .errors { color: red }
  </style>
</head>
<body bgcolor="#ffffff">

<h1>Basic converter examples</h1>

<f:view>
  <h:form>
    <h:panelGrid columns="4" border="1" cellspacing="0" cellpadding="5">
      <h:outputText value="Converter"/>
      <h:outputText value="Comments"/>
      <h:outputText value="Output"/>
      <h:outputText value="Errors"/>

      <h:inputText value="IntegerConverter"/>
      <h:outputText value="Implicit"/>
      <h:inputText id="Input1" value="#{user.numberOfVisits}"/>
      <h:message for="Input1" styleClass="errors"/>

      <h:inputText value="DoubleConverter"/>
      <h:outputText value="Implicit"/>
      <h:inputText id="Input4" value="#{user.balance}"/>
      <h:message for="Input4" styleClass="errors"/>

      <h:inputText value="LongConverter"/>
      <h:outputText value="Registered with converter attribute"/>
      <h:inputText id="Input2" converter="javax.faces.Long"/>
      <h:message for="Input2" styleClass="errors"/>

      <h:inputText value="LongConverter"/>
      <h:outputText value="Registered with <conveter> tag"/>
      <h:inputText id="Input3">
        <f:converter converterId="javax.faces.Long"/>
      </h:inputText>
      <h:message for="Input3" styleClass="errors"/>
    </h:panelGrid>
    <h:commandButton style="margin-top: 10px" value="Go!"/>
  </h:form>
</f:view>

</body>
</html>
