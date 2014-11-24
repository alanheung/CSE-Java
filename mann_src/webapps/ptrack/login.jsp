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

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:loadBundle basename="ptrackResources" var="bundle"/>
<f:view>
<html>
  <head>
    <title>
      <h:outputText value="#{bundle.AppNameHeader}"/>
    </title>

    <link rel="stylesheet" type="text/css"
          href="<%= request.getContextPath() %>/stylesheet.css"/>

    <script language="JavaScript">

       function set_image(button, img)
       {
         button.src = img;
       }

    </script>
  </head>

<body>


<h:form>

  <h:panelGrid columns="2" border="0" cellpadding="3" cellspacing="3">

     <h:graphicImage url="/images/logo.gif" alt="Welcome to ProjectTrack"
       title="Welcome to ProjectTrack" width="149" height="160"/>

       <h:panelGrid columns="3" border="0" cellpadding="5" cellspacing="3"
                    headerClass="login-heading">

          <f:facet name="header">
              <h:outputText value="#{bundle.AppNameHeader}"/>
          </f:facet>

          <h:messages globalOnly="true" styleClass="errors"/> <!>
          <h:panelGroup/>
          <h:panelGroup/>

          <h:outputLabel for="userNameInput">
             <h:outputText value="#{bundle.LoginCaption}"/>
          </h:outputLabel>
          <h:inputText id="userNameInput" size="20" maxlength="30"
                       required="true" value="#{authenticationBean.loginName}"> <!>
            <f:validateLength minimum="5" maximum="30"/>
          </h:inputText>
          <h:message for="userNameInput" styleClass="errors"/>

          <h:outputLabel for="passwordInput">
            <h:outputText value="#{bundle.PasswordCaption}"/>
          </h:outputLabel>
          <h:inputSecret id="passwordInput" size="20" maxlength="20"
                         required="true"
                         value="#{authenticationBean.password}">       <!>
            <f:validateLength minimum="5" maximum="15"/>
          </h:inputSecret>
          <h:message for="passwordInput" styleClass="errors"/>

          <h:panelGroup/>                      <!>
          <h:commandButton action="#{authenticationBean.login}" title="#{bundle.SubmitButtonTitle}"
                           image="#{facesContext.externalContext.requestContextPath}#{bundle.SubmitButtonImage}"
                           onmouseover="set_image(this,
                           '#{facesContext.externalContext.requestContextPath}#{bundle.SubmitButtonOverImage}')"
                           onmouseout="set_image(this,
                           '#{facesContext.externalContext.requestContextPath}#{bundle.SubmitButtonImage}');"/>

          <h:panelGroup/>

       </h:panelGrid>

       <!-- Info about login accounts; not in book -->

       <f:facet name="footer">
         <h:outputText styleClass="small" value='Login accounts: upper_mgr, proj_mgr, analyst, dev_mgr, sys_mgr, qa_mgr; password is always "faces"'/>
       </f:facet>

  </h:panelGrid>
</h:form>

</body>
</html>
</f:view>
