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
  <title>JSF in Action - DateTime converter examples</title>
  <style>
   .errors { color: red }
  </style>
</head>
<body bgcolor="#ffffff">

<h1>DateTime converter examples</h1>

  <f:view>
    <h:panelGrid columns="3" border="1" cellspacing="0" cellpadding="2">
      <h:outputText value="Comments"/>
      <h:outputText value="Output"/>
      <h:outputText value="Errors"/>

      <f:verbatim>
        default<br>
        value="{user.dateOfBirth}
      </f:verbatim>
      <h:outputText id="DateTime1" value="#{user.dateOfBirth}">
        <f:convertDateTime/>
      </h:outputText>
      <h:message for="DateTime1" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
         type="date"<br>
         dateStyle="medium"
     </f:verbatim>
      <h:outputText id="DateTime2" value="#{user.dateOfBirth}">
        <f:convertDateTime type="date" dateStyle="medium"/>
      </h:outputText>
      <h:message for="DateTime2"/>

      <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
         type="both"<br>
         dateStyle="full"
      </f:verbatim>
      <h:outputText id="DateTime3" value="#{user.dateOfBirth}">
        <f:convertDateTime type="both" dateStyle="full"/>
      </h:outputText>
      <h:message for="DateTime3" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
         type="time"<br>
         timeStyle="full"
			</f:verbatim>
      <h:outputText id="DateTime4" value="#{user.dateOfBirth}">
        <f:convertDateTime type="time" timeStyle="full"/>
      </h:outputText>
      <h:message for="DateTime4"/>

      <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
         size="25"<br>
         type="both"<br>
         timeStyle="short"<br>
         dateStyle="short"<br>
         timeZone="Europe/Moscow"
      </f:verbatim>
      <h:form>
        <h:inputText id="DateTime5" value="#{user.dateOfBirth}" size="25">
          <f:convertDateTime type="both" dateStyle="short" timeStyle="short"
                             timeZone="Europe/Moscow"/>
        </h:inputText>
         <h:commandButton value="Go!"/>
      </h:form>
      <h:message for="DateTime5" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
         type="both"<br>
         dateStyle="long"<br>
         timeStyle="full"<br>
         timeZone="Europe/Moscow"<br>
         locale="ru"
      </f:verbatim>
      <h:outputText id="DateTime6" value="#{user.dateOfBirth}">
        <f:convertDateTime type="both" dateStyle="long" timeStyle="full"
                           timeZone="Europe/Moscow" locale="ru"/>
      </h:outputText>
      <h:message for="DateTime6" styleClass="errors"/>

      <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
        pattern="MM/dd/yyyy (hh:mm a)"
      </f:verbatim>
      <h:form>
        <h:inputText id="DateFormat1" value="#{user.dateOfBirth}">
          <f:convertDateTime pattern="MM/dd/yyyy (hh:mm a)"/>
        </h:inputText>
         <h:commandButton value="Go!"/>
      </h:form>
      <h:message for="DateFormat1" styleClass="errors"/>

     <f:verbatim escape="false">
        value="{user.dateOfBirth}"<br>
        size="35"<br>
 		  	pattern="yy.dd.MM - hh:mm:ss a z G"<br>
        timeZone="Asia/Seoul"
     </f:verbatim>
      <h:form>
        <h:inputText id="DateFormat2" size="35" value="#{user.dateOfBirth}">
          <f:convertDateTime pattern="yy.dd.MM - hh:mm:ss a zz"
                             timeZone="Asia/Seoul"/>
        </h:inputText>
         <h:commandButton value="Go!"/>
      </h:form>
      <h:message for="DateFormat2" styleClass="errors"/>

     <f:verbatim escape="false">
         value="{user.dateOfBirth}"<br>
         pattern="hh 'o''clock' a zzzz"<br>
         timeZone="Asia/Seoul"
     </f:verbatim>
      <h:outputText id="DateFormatInput4" value="#{user.dateOfBirth}">
        <f:convertDateTime pattern="hh 'o''clock' a zzzz"
                           timeZone="Asia/Seoul"/>
      </h:outputText>
      <h:message for="DateFormatInput4" styleClass="errors"/>
    </h:panelGrid>
  </f:view>

</body>
</html>
