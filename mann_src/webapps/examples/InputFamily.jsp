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
	<title>JSF in Action - Input family examples</title>
</head>

<body>

<h1>Input family examples</h1>

<f:view>
  <h:messages/>
    <h:form id="myForm">
      <table border="1" cellspacing="0" cellpadding="5">
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
           HtmlInputHidden
         </td>
         <td>value="hide me!"<br>
             Invisible in the browser
         </td>
         <td>
            &nbsp;<h:inputHidden id="hiddenField" value="hide me!"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlInputText
         </td>
         <td>value="#{project.name}" size="30" maxlength="40"
             accesskey="T" tabindex="0"
         </td>
         <td>
            <h:inputText value="#{project.name}" size="30" maxlength="40"
                         accesskey="T" tabindex="0"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlInputText
         </td>
         <td>value="#{project.name}" size="30" disabled="true"
         </td>
         <td>
            <h:inputText value="#{project.name}" size="30" disabled="true"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlInputTextarea
         </td>
         <td>value="" rows="4" cols="50"
         </td>
         <td>
            <h:inputTextarea id="area23" value="" rows="4" cols="50"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlInputTextarea
         </td>
         <td>value="#{project.description}" rows="5"<br>
             accesskey="A" tabindex="1"<br>
             onmouseout="document.forms.myForm['myForm:area23'].value = this.value"
         </td>
         <td>
            <h:inputTextarea value="#{project.description}" rows="5"
                             accesskey="A" tabindex="1"
                             onmouseout="document.forms.myForm['myForm:area23'].value = this.value"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlInputSecret
         </td>
         <td>value="#{user.password}" size="10"<br>
             maxlength="10" tabindex="2
         </td>
         <td>
            <h:inputSecret value="#{user.password}" size="10" maxlength="10"
                           tabindex="2"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlInputScret
         </td>
         <td>value="#{user.password}" redisplay="true"
         </td>
         <td>
            <h:inputSecret value="#{user.password}" redisplay="true"/>
         </td>
       </tr>
     </table>
    <p>
    <h:commandButton value="Submit"/>
  </h:form>
</f:view>

</body>
</html>
