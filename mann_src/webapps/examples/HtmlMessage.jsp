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
	<title>JSF in Action - HtmlMessage example</title>
  <style>
   .errors { color: red }
  </style>
</head>
<body bgcolor="#ffffff">

<h1>HtmlMessage example</h1>

<f:view>
  <h:form>
    <h:panelGrid columns="2" border="1" cellspacing="0" cellpadding="2">
      <h:outputText value="Comments"/>
      <h:outputText value="Output"/>

      <h:outputText value='for="myOtherInput" styleClass="errors"'/>
      <h:message for="myOtherInput" styleClass="errors"/>

      <f:verbatim>
       for="myOtherInput" showDetail="true"<br>
       showSummary="true" warnStyle="color: red"<br>
       infoStyle="color: blue" errorStyle="color: red"
      </f:verbatim>
      <h:message for="myOtherInput" showDetail="true" showSummary="true" warnStyle="color: red"
                 infoStyle="color: blue" errorStyle="color: red"/>
    </h:panelGrid>
    <h:outputLabel for="myOtherInput">
      <h:outputText value="Enter text to generate error messages (a number between 1 and 100 with a length between 0 and 3):"/>
    </h:outputLabel>
    <h:inputText id="myOtherInput">
      <f:validateLength minimum="0" maximum="3"/>
      <f:validateLongRange minimum="1" maximum="100"/>
    </h:inputText>
    <h:commandButton style="margin-top: 5px" value="Go!"/>
  </h:form>
</f:view>

</body>
</html>
