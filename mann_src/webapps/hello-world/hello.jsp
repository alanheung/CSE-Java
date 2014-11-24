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

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
  <html>
    <head>
      <title>
        JSF in Action - Hello, world!
      </title>
    </head>
    <body>
      <h:form id="welcomeForm">
        <h:outputText id="welcomeOutput" value="Welcome to JavaServer Faces!"
                       style="font-family: Arial, sans-serif; font-size: 24; color: green;"/>
        <p>
         <h:message id="errors" for="helloInput" style="color: red"/>
        </p>
        <p>
          <h:outputLabel for="helloInput">
            <h:outputText id="helloInputLabel"
                          value="Enter number of controls to display:"/>
          </h:outputLabel>
          <h:inputText id="helloInput" value="#{helloBean.numControls}"
                       required="true">
            <f:validateLongRange minimum="1" maximum="500"/>
          </h:inputText>
        </p>
        <p>
          <h:panelGrid id="controlPanel" binding="#{helloBean.controlPanel}"
                       columns="20" border="1" cellspacing="0"/>
        </p>
        <h:commandButton id="redisplayCommand" type="submit" value="Redisplay"
                         actionListener="#{helloBean.addControls}"/>

        <h:commandButton id="goodbyeCommand" type="submit" value="Goodbye"
                         action="#{helloBean.goodbye}" immediate="true"/>
      </h:form>
    </body>
  </html>
</f:view>
