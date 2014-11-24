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
  <title>JSF in Action - Validator examples</title>
</head>

<body>
<f:loadBundle basename="CustomMessages" var="bundle"/>
<h1>Validator examples</h1>

<f:view>
  <h:form>
      <table border="1" cellspacing="0" cellpadding="5">
       <tr>
         <td>
           <b>Validator(s)</b>
         </td>
         <td>
           <b>Comments</b>
         </td>
         <td>
           <b>Input</b>
         </td>
         <td>
           <b>Errors</b>
         </td>
       </tr>
       <tr>
         <td>Validation method</td>
         <td>validator=#{testForm.validateEmail}</td>
         <td>
            <h:inputText id="methodInput" validator="#{testForm.validateEmail}"/>
         </td>
         <td>
            <h:message for="methodInput" style="color: red"/>
         </td>
       </tr>
       <tr>
         <td>None (component property)</td>
         <td>required="true"</td>
         <td>
            <h:selectOneMenu  id="RequiredInput" required="true">
             <f:selectItem itemValue="" itemLabel=""/>
             <f:selectItem itemValue="1" itemLabel="dogs"/>
             <f:selectItem itemValue="2" itemLabel="birds"/>
             <f:selectItem itemValue="3" itemLabel="hamsters"/>
            </h:selectOneMenu >
         </td>
         <td>
            <h:message for="RequiredInput" style="color: red"/>
         </td>
       </tr>
       <tr>
         <td>Length</td>
         <td>
             minimum="2"<br>
             maxmimum="10"
         </td>
         <td>
            <h:inputText id="LengthInput">
             <f:validateLength minimum="2" maximum="10"/>
            </h:inputText>
         </td>
         <td>
            <h:message for="LengthInput" style="color: red"/>
         </td>
       </tr>
       <tr>
         <td>LongRange</td>
         <td>
             minimum="5"<br>
             maxmimum="999999"
         </td>
         <td>
            <h:inputText id="LongRangeInput">
             <f:validateLongRange minimum="5" maximum="999999"/>
            </h:inputText>
         </td>
         <td>
            <h:message for="LongRangeInput" style="color: red"/>
         </td>
       </tr>
       <tr>
         <td>DoubleRange</td>
         <td>
             minimum="5.1"<br>
             maxmimum="6.76"
         </td>
         <td>
            <h:selectOneRadio id="DoubleRangeInput">
              <f:selectItem itemValue="5.0" itemLabel="5.0"/>
              <f:selectItem itemValue="6.1" itemLabel="6.1"/>
              <f:selectItem itemValue="6.8" itemLabel="6.8"/>
              <f:validateDoubleRange minimum="5.1" maximum="6.76"/>
            </h:selectOneRadio>
         </td>
         <td>
            <h:message for="DoubleRangeInput" style="color: red"/>
         </td>
       </tr>
       <tr>
         <td>Length, LongRange</td>
         <td>
             required="true"<br>
             Length minimum="2"<br>
             Length maxmimum="3"<br>
             LongRange minimum="10"<br>
             LongRange maxmimum="999"
         </td>
         <td>
            <h:inputText id="MultiInput" required="true">
             <f:validateLength minimum="2" maximum="3"/>
             <f:validateLongRange minimum="10" maximum="999"/>
            </h:inputText>
         </td>
         <td>
            <h:message for="MultiInput" style="color: red"/>
         </td>
       </tr>
     </table>
    <p>
    <h:commandButton value="Go!"/>
  </h:form>
</f:view>

</body>
</html>
