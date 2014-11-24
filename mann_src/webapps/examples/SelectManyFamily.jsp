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

<head>
	<title>JSF in Action - HtmlMessages example</title>
  <link rel="stylesheet" type="text/css"
        href="stylesheet.css"/>
  <style>
    .disabled { color: grey; }
  </style>
</head>

<h1>SelectMany family examples</h1>

 <%
    javax.faces.model.SelectItem select1 = new javax.faces.model.SelectItem("3", "birds", "");
    javax.faces.model.SelectItem select2 = new javax.faces.model.SelectItem("4", "hamsters", "");
    javax.faces.model.SelectItem select3 = new javax.faces.model.SelectItem("99", "tree frog", "");

    pageContext.setAttribute("selectAnimals", new javax.faces.model.SelectItem[] {select1, select2, select3}, PageContext.SESSION_SCOPE);
    pageContext.setAttribute("selectHamsters", select2, PageContext.SESSION_SCOPE);
%>

<f:loadBundle basename="StandardComponentsResources" var="bundle"/>
<f:view>

<h:messages/>

  <h:form >

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
       HtmlSelectManyCheckbox
     </td>
     <td>accesskey="C" required="true"<br>
         disabledClass="disabled"<br>
         default layout ("lineDirection")<br>
         hardcoded items
     </td>
     <td>
        <h:selectManyCheckbox accesskey="C" required="true" disabledClass="disabled">
            <f:selectItem itemValue="0" itemLabel="cats"
                          itemDescription="Description not displayed"/>
            <f:selectItem itemValue="1" itemLabel="dogs"/>
            <f:selectItem itemValue="2" itemLabel="birds"/>
            <f:selectItem itemValue="3" itemLabel="hamsters"/>
            <f:selectItem itemValue="4" itemLabel="lizards"/>
            <f:selectItem itemValue="5" itemLabel="snakes"/>
            <f:selectItem itemValue="6" itemLabel="koala bears" itemDisabled="#{user.numberOfVisits > 20}"/>
        </h:selectManyCheckbox>
      </td>
   </tr>
  <tr>
     <td>
      HtmlSelectManyCheckbox
     </td>
     <td>layout="pageDirection"<br>
         one item from expression
     </td>
     <td>
        <h:selectManyCheckbox id="checkboxList"  layout="pageDirection">
            <f:selectItem itemValue="0" itemLabel="cats"/>
            <f:selectItem itemValue="1" itemLabel="dogs"/>
            <f:selectItem value="#{animalForm.lizardGroup}"/>
        </h:selectManyCheckbox>
      </td>
   </tr>
   <tr>
     <td>
       HtmlSelectManyListBox
     </td>
     <td>value="#{animalForm.favoriteAnimal}" size="2"<br>
         valueChangeListener="#{animalForm.favoriteAnimalChange}"<br>
         selectItems from expression
     </td>
     <td>
        <h:selectManyListbox value="#{animalForm.favoriteAnimals}" size="2"
                             valueChangeListener="#{animalForm.favoriteAnimalsChange}">
            <f:selectItems value="#{selectAnimals}"/>
        </h:selectManyListbox>
      </td>
   </tr>
   <tr>
     <td>
       HtmlSelectManyListbox
     </td>
     <td>style="extra-border" tabindex="5"<br>
         hardcoded items, one from expression
     </td>
     <td>
        <h:selectManyListbox style="extra-border" tabindex="5">
          <f:selectItem itemValue="0" itemLabel="cats"/>
          <f:selectItem itemValue="1" itemLabel="dogs"/>
          <f:selectItems value="#{animalForm.lizardGroup}"/>
        </h:selectManyListbox>
      </td>
   </tr>
   <tr>
     <td>
       HtmlSelectManyMenu
     </td>
     <td>title="#{bundle.animalListTitle}" immediate="true"<br>
         styleClass="extra-border"<br>
         hardcoded items
     </td>
     <td>
        <h:selectManyMenu title="#{bundle.animalListTitle}" immediate="true"
                          styleClass="extra-border">
            <f:selectItem itemValue="0" itemLabel="cats"/>
            <f:selectItem itemValue="1" itemLabel="dogs"/>
            <f:selectItem itemValue="2" itemLabel="birds"/>
        </h:selectManyMenu>
      </td>
   </tr>
 </table>
  <p>
  <h:commandButton value="Submit"/>

  </h:form>
</f:view>
