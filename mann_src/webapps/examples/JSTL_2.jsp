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
  <title>JSF in Action - JSTL Example 2 - More JSF and JSTL Examples</title>
</head>
  <body bgcolor="#FFFFFF">

    <f:view>
      <jsp:useBean class="org.jia.examples.TestForm" id="exampleBean"
                     scope="session"/>

      <h1>
        <h:outputText value="More JSF and JSTL Examples"/>
      </h1>

      <h:messages/>

      <h:form>
        <h:outputLabel for="inputInt">
          <h:outputText value="How many times do you want to repeat the Oracle's prophecy?"/>
        </h:outputLabel>

        <h:inputText id="inputInt" value="#{sessionScope.exampleBean.number}"/>
        <h:commandButton value="Go!"/>
        <p>
           <c:if test="${sessionScope.exampleBean.number > 0}">
             <c:forEach begin="0" end="${sessionScope.exampleBean.number - 1}" var="count">
                Queen Tracey will achieve world domination.<br>
             </c:forEach>
           </c:if>
        </p>
      </h:form>
      <hr/>
      <h:form>
        <h:outputText value="If you entered a number greater than 10,
                              an input control will display below."/>
        <p>
        <%-- JSTL approach --%>
          <c:if test="${sessionScope.exampleBean.number > 10}">
            <h:outputLabel id="inputStringLabel"for="inputString">
              <h:outputText id="outputStringLabel" value="Enter in your string. JSF will
                                                    remember the value unless this control is hidden."/>
            </h:outputLabel>
            <h:inputText id="inputString"/>
            <h:commandButton value="Go!"/>
          </c:if>
        </p>
        <p>
          <%-- JSF approach
          <h:panelGroup rendered="#{sessionScope.exampleBean.number > 10}">
            <h:outputLabel id="inputStringLabel2"for="inputString">
              <h:outputText id="outputStringLabel2" value="Enter in your string. JSF will
                                                    remember the value."/>
            </h:outputLabel>
            <h:inputText id="inputString2"/>
            <h:commandButton value="Go!"/>
          </h:panelGroup> --%>
        </p>

      </h:form>
    </f:view>
  </body>
</html>
