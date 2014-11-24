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
  <title>JSF in Action - Localizatin examples</title>
</head>
<body bgcolor="#FFFFFF">

<h1>JSF in Action - Localization examples</h1>

<f:loadBundle basename="LocalizationResources" var="bundle"/>

  <f:view>
    <h:messages style="color:red"/>
    <h:form>
      <p>
      <table border="1" cellspacing="0" cellpadding="2">
       <tr>
         <td>
           <b>Component</b>
         </td>
         <td>
           <b>Comments</b>
         </td>
         <td>
           <b>Output</b>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputText
         </td>
         <td>value=#{bundle.halloween}
         </td>
         <td>
           <h:outputText value="#{bundle.halloween}"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>
           value=#{bundle.numberOfVisits}<br>
           two parameters: <br>
           value=#{user.numberOfVisits}<br>
           value=#{user.firstName}
         </td>
         <td>
           <h:outputFormat value="#{bundle.numberOfVisits}">
            <f:param value="#{user.numberOfVisits}"/>
            <f:param value="#{user.firstName}"/>
           </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlCommandButton
         </td>
         <td>value="#{bundle.toggleLocale}"
         </td>
         <td>
            <h:commandButton value="#{bundle.toggleLocale}"
                             actionListener="#{testForm.toggleLocale}"/>
          </td>
       </tr>
       <tr>
         <td>
           HtmlGraphicImage
         </td>
         <td>value="#{bundle.helloImage}"
         </td>
         <td>
            <h:graphicImage value="#{bundle.helloImage}"/>
          </td>
       </tr>
      </table>
    </h:form>
  </f:view>

</body>
</html>
