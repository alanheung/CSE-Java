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
  <title>JSF in Action - UIViewRoot example</title>
</head>
<body bgcolor="#ffffff">
<h1>UIViewRoot example</h1>

  <f:view>
    <span style="background-color:grey">
       This is template text.
    </span>
    <h:panelGrid columns="2" border="1">
      <h:outputText value="This is an HtmlOutputText component."/>
      <h:graphicImage url="images/hello.gif"/>
    </h:panelGrid>
  </f:view>

</body>
</html>
