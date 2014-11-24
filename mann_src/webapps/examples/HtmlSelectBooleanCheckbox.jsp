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
  <title>JSF in Action - HtmlSelectBooleanCheckbox examples</title>
</head>

<body>

<h1>HtmlSelectBooleanCheckbox examples</h1>

<f:view>

<h:messages/>

  <h:form id="myForm">
    <table border="1" cellspacing="0" cellpadding="5">
     <tr>
       <td>
         <b>Comments</b>
       </td>
       <td>
         <b>Output</b>
       </td>
     </tr>
     <tr>
       <td>value="true" tabindex="0"
       </td>
       <td>
          <h:selectBooleanCheckbox id="myCheckBox" value="true" tabindex="0"/>
      </td>
     </tr>
     <tr>
       <td>value="#{user.registered}" title="Registered?" tabindex="0"
       </td>
       <td>
          <h:selectBooleanCheckbox value="#{user.registered}" title="Registered?" tabindex="0"/>
        </td>
     </tr>
    </table>
    <p>
    <h:commandButton value="Submit"/>
  </h:form>
</f:view>

</body>
</head>
