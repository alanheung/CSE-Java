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
  <title>JSF in Action - SelectOne family examples</title>
  <link rel="stylesheet" type="text/css"
         href="stylesheet.css"/>
  <style>
    .disabled { color: grey; }
  </style>
</head>


<body>

<h1>SelectOne family examples</h1>

 <%
    javax.faces.model.SelectItem select1 = new javax.faces.model.SelectItem("3", "birds", "");
    javax.faces.model.SelectItem select2 = new javax.faces.model.SelectItem("4", "hamsters", "");
    javax.faces.model.SelectItem select3 = new javax.faces.model.SelectItem("99", "tree frog", "");

    pageContext.setAttribute("selectAnimals", new javax.faces.model.SelectItem[] {select1, select2, select3}, PageContext.SESSION_SCOPE);
    pageContext.setAttribute("selectHamster", select2, PageContext.SESSION_SCOPE);
%>

<f:view>

<h:messages/>

  <h:form>
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
         HtmlSelectOneRadio
       </td>
       <td>value="#{user.favoriteAnimal}" border="2"<br>
           disabledClass="disabled"<br>
           hardcoded items
       </td>
       <td>
          <h:selectOneRadio id="RadioInput1" value="#{user.favoriteAnimal}" border="2"
                            disabledClass="disabled">
              <f:selectItem itemValue="0" itemLabel="cats"
                            itemDescription="Description not displayed"/>
              <f:selectItem itemValue="1" itemLabel="dogs"/>
              <f:selectItem itemValue="2" itemLabel="birds"/>
              <f:selectItem itemValue="3" itemLabel="hamsters"/>
              <f:selectItem itemValue="4" itemLabel="lizards"/>
              <f:selectItem itemValue="5" itemLabel="snakes"/>
              <f:selectItem itemValue="6" itemLabel="koala bears" itemDisabled="#{user.numberOfVisits > 20}"/>
          </h:selectOneRadio>
        </td>
     </tr>
    <tr>
       <td>
         HtmlSelectOneRadio
       </td>
       <td>layout="pageDirection"<br>
           hardcoded items; item list from expression
       </td>
       <td>
          <h:selectOneRadio id="radioList" layout="pageDirection">
              <f:selectItem itemValue="0" itemLabel="cats"/>
              <f:selectItem itemValue="1" itemLabel="dogs"/>
              <f:selectItem value="#{animalForm.lizardGroup}"/>
          </h:selectOneRadio>
        </td>
     </tr>
     <tr>
       <td>
         HtmlSelectOneListBox
       </td>
       <td>title="Pick an animal" value="#{animalForm.favoriteAnimal}"<br>
           size="2"<br>
           item list from expression
       </td>
       <td>
          <h:selectOneListbox id="ListboxInput1" title="Pick an animal"
                              value="#{animalForm.favoriteAnimal}"
                              size="2">
              <f:selectItems value="#{selectAnimals}"/>
          </h:selectOneListbox>
        </td>
     </tr>
     <tr>
       <td>
        HtmlSelectOneListbox
       </td>
       <td>style="extra-border" tabindex="5"<br>
           hardcoded item; item list from expression
       </td>
       <td>
          <h:selectOneListbox style="extra-border" tabindex="5">
            <f:selectItem itemValue="0" itemLabel="cats"/>
            <f:selectItem itemValue="1" itemLabel="dogs"/>
            <f:selectItems value="#{animalForm.lizardGroup}"/>
          </h:selectOneListbox>
        </td>
     </tr>
     <tr>
       <td>
         HtmlSelectOneMenu
       </td>
       <td>title="HtmlSelectOneMany example"<br>
           hardcoded items
       </td>
       <td>
          <h:selectOneMenu title="HtmlSelectOneMany example">
              <f:selectItem itemValue="0" itemLabel="cats"/>
              <f:selectItem itemValue="1" itemLabel="dogs"/>
              <f:selectItem itemValue="2" itemLabel="birds"/>
              <f:selectItem itemValue="3" itemLabel="hamsters"/>
              <f:selectItem itemValue="4" itemLabel="lizards"/>
              <f:selectItem itemValue="5" itemLabel="snakes"/>
              <f:selectItem itemValue="6" itemLabel="koala bears"
                            itemDisabled="#{user.numberOfVisits > 20}"/>
          </h:selectOneMenu >
        </td>
     </tr>
     <tr>
       <td>
         HtmlSelectOneMenu
       </td>
       <td>value="#{user.favoriteAnimal}" styleClass="extra-border"<br>
           accesskey="F"<br>
           single items and item list taken from expressions
       </td>
       <td>
          <h:selectOneMenu id="MenuInput1" value="#{user.favoriteAnimal}" styleClass="extra-border"
                           accesskey="F">
              <f:selectItems value="#{selectAnimals}"/>
              <f:selectItem value="#{selectHamster}"/>
              <f:selectItems value="#{animalForm.lizardGroup}"/>
          </h:selectOneMenu>
        </td>
     </tr>
   </table>
   <p>
   <h:commandButton value="Submit"/>
  </h:form>
</f:view>

</body>
</html>
