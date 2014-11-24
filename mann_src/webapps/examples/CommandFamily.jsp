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
  <title>JSF in Action - Command family component examples</title>
  <style>
    .button { border: 1px; padding: 4px; border-style: solid; border-color: black; color: blue; }
  </style>
</head>

<body>

<h1>Command family examples</h1>

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
         HtmlCommandButton
       </td>
       <td>value="Next >>" action="next"
       </td>
       <td>
          <h:commandButton value="Next >>" action="next"/>
       </td>
     </tr>
     <tr>
       <td>
         HtmlCommandButton
       </td>
       <td>image="images/logout.gif" alt="Logout"<br>
           action="#{testForm.logout}"
       </td>
       <td>
          <h:commandButton image="images/logout.gif" alt="Logout"
                           action="#{testForm.logout}"/>
       </td>
     </tr>
    <tr>
       <td>
         HtmlCommandButton
       </td>
       <td>value="Reset" title="Reset"<br>
           type="reset" styleClass="button"<br>
           tabindex="2"
       </td>
       <td>
          <h:form>
            <h:inputText value="the original"/><p/>
            <h:commandButton value="Reset" title="Reset" type="reset"
                             styleClass="button" tabindex="2"/>
          </h:form>
       </td>
     </tr>
    <tr>
       <td>
         HtmlCommandLink
       </td>
       <td>action="next"<br>
           Child UIOutput and action listener
       </td>
       <td>
          <h:commandLink action="next">
            <h:outputText value="Next >>"/>
            <f:actionListener type="org.jia.examples.TestActionListener"/>
          </h:commandLink>
       </td>
    </tr>
    <tr>
       <td>
         HtmlCommandLink
       </td>
       <td>action="#{mailManager.loadInbox}"<br>
           styleClass="button" <br>
           title="#{user.firstName}'s Inbox"<br>
           child HtmlGraphicImage, HtmlOutputText, and UIParameter components
       </td>
       <td>
        <h:commandLink id="inboxLink" action="#{mailManager.loadInbox}"
                       styleClass="button" title="#{user.firstName}'s Inbox">
          <h:graphicImage url="images/inbox.gif" style="border: 0; padding-right: 5px"/>
          <h:outputText value="#{user.firstName}'s Inbox"/>
          <f:param name="showAllColumns" value="true"/>
        </h:commandLink>
       </td>
     </tr>
   </table>
  </h:form>
</f:view>

</body>
</html>
