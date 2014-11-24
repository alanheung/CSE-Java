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
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
  <title>JSF in Action: JSTL Example 1 - Mixing JSF with other custom tags</title>
</head>
<body bgcolor="#FFFFFF">

  <f:view>
    <h1>
      <h:outputText value="Example of using JSF tags with other custom tags"/>
    </h1>
    <p>
      <b>
        <c:out value="Here's the value of your web.xml (don't do this at home):"/>
      </b>
      <blockquote>
      <f:verbatim escape="true">
        <c:import url="WEB-INF/web.xml"/>
      </f:verbatim>
      </blockquote>
    </p>
  </f:view>

</body>
</html>


