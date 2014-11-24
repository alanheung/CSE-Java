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
<%@ taglib uri="jsf-in-action-components" prefix="jia" %>

<html>
<head>
<title>JSF in Action - RolloverButton Custom Renderer</title>
  <style>
  .foo { padding: 5px; background-color: #C1C1FF; }
  </style>
</head>
<body bgcolor="#ffffff">
<h1>RolloverButton Renderer</h1>
<f:loadBundle basename="CustomComponentResources" var="bundle"/>
<f:view>
  <h:form>
      <h:panelGrid cellspacing="10">

      <jia:commandRolloverButton action="#{testForm.incrementCounter}"
                                 value="Reset" alt="Submit" title="Submit"
                                 type="reset"/>

      <jia:commandRolloverButton actionListener="#{testForm.incrementCounter}"
                                 value="#{testForm.message}" styleClass="foo"/>

      <jia:commandRolloverButton action="#{testForm.incrementCounter}"
                                 alt="Submit" title="Submit"
                                 image="#{bundle.submitImage}"/>

      <jia:commandRolloverButton action="#{testForm.incrementCounter}"
                                 image="images/submit.gif"
                                 rolloverImage="images/submit_over.gif"
                                 alt="Submit" title="Submit"
                                 style="margin-bottom: 10px"/>
    </h:panelGrid>

    <h:panelGrid columns="2" cellpadding="2">
      <h:outputText style="font-weight: bold"
                    value="Property modified by action: #{testForm.counter}"/>
    </h:panelGrid>

  </h:form>
</f:view>
</body>
</html>
