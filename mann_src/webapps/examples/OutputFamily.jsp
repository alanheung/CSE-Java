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
  <title>Output family examples</title>
</head>

<jsp:useBean id="testForm" scope="session" class="org.jia.examples.TestForm"/>

<body>

<h1>Output family examples</h1>

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
           <b>Ouput</b>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputText
         </td>
         <td>value="What are you looking at?"
         </td>
         <td>
            <h:outputText value="What are you looking at?"/>
          </td>
       </tr>
       <tr>
         <td>
           HtmlOutputText
         </td>
         <td>value="What are &lt;i&gt;you&lt;/i&gt; looking at?"
         </td>
         <td>
            <h:outputText value="What are <i>you</i> looking at?"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputText
         </td>
         <td>escape="false"<br>
             value="What are &lt;i&gt;you&lt;/i&gt; looking at?"
         </td>
         <td>
            <h:outputText escape="false" value="What are <i>you</i> looking at?"/>
          </td>
       </tr>
       <tr>
         <td>
           HtmlOutputText
         </td>
         <td>value="Hello, #{user.firstName}!" <br>
             style="color:green"
         </td>
         <td>
            <h:outputText id="HtmlOutputText" value="Hello, #{user.firstName}!" style="color:green"/>
          </td>
       </tr>
       <tr>
         <td>
           HtmlOutputLabel
         </td>
         <td>for="userNameInput" accesskey="N"<br>
             With child HtmlOutputText component
         </td>
         <td>
            <h:outputLabel for="userNameInput" accesskey="N" id="blah">
              <h:outputText value="Enter your name: "/>
            </h:outputLabel>
            <h:inputText id="userNameInput"/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputLabel
         </td>
         <td>for="userNameInput2" title="Enter your name" <br>
             accesskey="N" styleClass="input_label"<br>
             With child HtmlGraphicImage, HtmlOutputText, and HtmlInputText components
         </td>
         <td>
           <h:outputLabel id="HtmlOutputLabel" for="userNameInput2" title="Enter your name" accesskey="N" styleClass="input_label">
             <h:graphicImage url="/images/create.gif"/>
             <h:outputText value="Enter your name:"/>
             <h:inputText id="userNameInput2"/>
           </h:outputLabel>
         </td>
       </tr>
       <tr>
         <td>
           UIOutput
         </td>
         <td>Uses the &lt;verbatim&gt; tag with escape="true"
         </td>
         <td>
          <pre>
           <f:verbatim escape="true">
            <application>
              <message-bundle>CustomMessages</message-bundle>
              <locale-config>
                <default-locale>en</default-locale>
                <supported-locale>en</supported-locale>
                <supported-locale>es</supported-locale>
              </locale-config>
            </application>
           </f:verbatim>
          </pre>
         </td>
       </tr>
       <tr>
         <td>
           UIOutput
         </td>
         <td>Uses the &lt;verbatim&gt; inside of a HtmlpanelGrid  with JSTL tags and HTML
         </td>
         <td>
           <h:panelGrid columns="4" border="1">
             <f:verbatim>
               <c:forEach items="${user.favoriteSites}" var="site">
                 <c:out value="${site}, "/>
               </c:forEach>
             </f:verbatim>
             <f:verbatim escape="false">
               <p><font color="red">This is normal <u>HTML</u> text.</font></p>
             </f:verbatim>
           </h:panelGrid>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>
           value="Hey {0}. This is a static value: {1}.  {0}, you''re using: {2}."<br>
           Child UIParameter components.
         </td>
         <td>
           <h:outputFormat value="Hey {0}. This is a static value: {1}.  {0}, you''re using: {2}.">
             <f:param value="#{user.firstName}"/>
             <f:param value="hardcoded"/>
             <f:param value="#{header['User-Agent']}"/>
           </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputText
         </td>
         <td>
           value="Hey #{user.firstName}. This is a static value: hardcoded. #{user.firstName}, you're using: #{header['User-Agent']}."
         </td>
         <td>
           <h:outputText value="Hey #{user.firstName}. This is a static value: hardcoded. #{user.firstName}, you're using: #{header['User-Agent']}."/>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>
           styleClass="myStyle" value="Parameter: {0}, curly braces: '{' '}'."
         </td>
         <td>
          <h:outputFormat id="format" styleClass="myStyle" value="Parameter: {0}, curly braces: '{' '}'.">
             <f:param value="param"/>
          </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>
           Using a date format pattern.<br>
           value="Hey {0}, you were born on {1, date, medium}."<br>
           Child UIParameter components.
         </td>
         <td>
           <h:outputFormat value="Hey {0}, you were born on {1, date, medium}.">
             <f:param value="#{user.firstName}"/>
             <f:param value="#{user.dateOfBirth}"/>
           </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>value="Hey {0}, you were born on {1}."<br>
             UIParameter components used for parameters.
         </td>
         <td>
           <h:outputFormat value="Hey {0}, you were born on {1}.">
             <f:param value="#{user.firstName}"/>
             <f:param value="#{user.dateOfBirth}"/>
           </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>
           Simple use of a choice format for plurals.<br>
           value="You have visited us {0} {0, choice, 0#times|1#time|2#times}."<br>
           Child UIParameter components.
         </td>
         <td>
           <jsp:setProperty name="user" property="numberOfVisits" value="0"/>
           <h:outputFormat value="You have visited us {0} {0, choice, 0#times|1#time|2#times}.">
             <f:param value="#{user.numberOfVisits}"/>
           </h:outputFormat>
           <jsp:setProperty name="user" property="numberOfVisits" value="1"/>
           <h:outputFormat value="You have visited us {0} {0, choice, 0#times|1#time|2#times}.">
             <f:param value="#{user.numberOfVisits}"/>
           </h:outputFormat>
           <jsp:setProperty name="user" property="numberOfVisits" value="2"/>
           <h:outputFormat value="You have visited us {0} {0, choice, 0#times|1#time|2#times}.">
             <f:param value="#{user.numberOfVisits}"/>
           </h:outputFormat>
           <jsp:setProperty name="user" property="numberOfVisits" value="3"/>
           <h:outputFormat value="You have visited us {0} {0, choice, 0#times|1#time|2#times}.">
             <f:param value="#{user.numberOfVisits}"/>
           </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputFormat
         </td>
         <td>Use of choice format with an embedded message format pattern.<br />
             value="#{user.numberOfVisits} The number is {0, choice, 0#zero|1#one|2#two|3#three|4#four|5#five|6#six|7#seven|8#eight|9#nine|10#ten|11#{0}}."<br>
             Child UIParameter components.
         </td>
         <td>
           <jsp:setProperty name="testForm" property="number" value="3"/>
           <h:outputFormat value="#{user.numberOfVisits} The number is {0, choice, 0#zero|1#one|2#two|3#three|4#four|5#five|6#six|7#seven|8#eight|9#nine|10#ten|11#{0}}.">
             <f:param value="#{testForm.number}"/>
           </h:outputFormat>
           <jsp:setProperty name="testForm" property="number" value="15"/>
           <h:outputFormat value="The number is {0, choice, 0#zero|1#one|2#two|3#three|4#four|5#five|6#six|7#seven|8#eight|9#nine|10#ten|11#11}.">
             <f:param value="#{testForm.number}"/>
           </h:outputFormat>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputLink
         </td>
         <td>value="#{facesContext.externalContext.requestContextPath}/images/hello.gif"
         </td>
         <td>
            <h:outputLink value="#{facesContext.externalContext.requestContextPath}/images/hello.gif">
              <h:outputText value="Hello image"/>
            </h:outputLink>
         </td>
       </tr>
       <tr>
         <td>
           HtmlOutputLink
         </td>
         <td>image="http://us.i1.yimg.com/us.yimg.com/images/promo/join/yahoo.gif"<br>
             href="http://www.yahoo.com"<br>label="Yahoo!"
         </td>
         <td>
          <h:outputLink value="http://www.yahoo.com" accesskey="Y">
            <h:outputText value="Yahoo's main page."/>
            <h:graphicImage url="http://us.i1.yimg.com/us.yimg.com/images/promo/join/yahoo.gif"/>
          </h:outputLink>
         </td>
       </tr>
       <tr>
         <td>
            HtmlOutputLink
         </td>
         <td>href="http://groups.google.com/groups"<br>
             label="Google Groups - Computers (in French)"<br>
             Child UIOutput and UIParameter components
         </td>
         <td>
          <h:outputLink value="http://groups.google.com/groups">
            <h:outputText value="Google Groups - Computers (in French)"/>
            <f:param name="group" value="comp"/>
            <f:param name="hl" value="fr"/>
          </h:outputLink>
         </td>
       </tr>
      </table>
    </h:form>
  </f:view>
</body>
</head>
