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
  <title>JSF in Action - HtmlGraphicImage examples</title>
</head>

<body>

<h1>HtmlGraphicImage examples</h1>

<f:view>
  <h:form>
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
       <td>url="/images/logo.gif" alt="Welcome to ProjectTrack"<br>
           title="Welcome to ProjectTrack" width="149" height="160"
       </td>
       <td>
         <h:graphicImage url="/images/logo.gif" alt="Welcome to ProjectTrack"
                         title="Welcome to ProjectTrack" width="149" height="160">
         </h:graphicImage>
       </td>
     </tr>
     <tr>
       <td>url="#{testForm.string}" width="150" height="150" <br>
           alt="The guy on the cover; stretched."
       </td>
       <td>
          <jsp:useBean id="testForm" scope="session" class="org.jia.examples.TestForm">
          </jsp:useBean>
          <jsp:setProperty name="testForm" property="string" value="http://www.manning.com/images/mann.gif"/>
          <h:graphicImage url="#{testForm.string}" width="150" height="150" alt="The guy on the cover; stretched."/>
       </td>
     </tr>
    </table>
  </h:form>
</f:view>

</body>
</html>
