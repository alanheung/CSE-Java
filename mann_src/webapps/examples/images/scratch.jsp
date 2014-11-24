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
<%@ taglib prefix="ex" uri="/jstl-examples-taglib" %>

<f:view>

<h:form>
  <h:inputText immediate="true" value="#{testForm.message}"/>
  <h:commandButton value="Go!" action="#{testForm.testImmediate}" immediate="true"/>
</h:form>
<hr>
<h:form>

<h:inputText value="#{user.balance}" valueChangeListener="#{testForm.processValueChanged}"/>
<p>
<h:selectManyCheckbox>
  <f:selectItems value="#{testForm.colors}"/>
  <f:valueChangeListener type="org.jia.examples.TestValueChangeListener"/>
</h:selectManyCheckbox>
<p>
<h:selectManyCheckbox valueChangeListener="#{testForm.processValueChanged}">
  <f:selectItems value="#{testForm.colors}"/>
  <f:valueChangeListener type="org.jia.examples.TestValueChangeListener"/>
  <f:valueChangeListener type="org.jia.examples.TestValueChangeListener"/>
</h:selectManyCheckbox>
</h:form>
<p>
  <h:form title="claimForm">
    <h:outputLabel for="inputText">
      <h:outputText value="Enter some text:"/>
    </h:outputLabel>
    <h:inputText/>
    <h:commandButton value="Go!"/>
 </h:form>
<hr>
<h:form>
  <h:dataTable binding="#{testForm.dataTable}" var="item">
    <h:column>
      <h:outputText value="#{item}"/>
    </h:column>
  </h:dataTable>
 <h:commandButton value="foo!"/>
</h:form>
<hr>

<p>
  <h:panelGrid id="logonPanel1" columns="2" border="1"
         cellpadding="3" cellspacing="3"
         title="Simple grid">
  </h:panelGrid>

</p>

<jsp:include page="foo.jsp"/>

<h:form>
<h:outputLabel for="changeInput">
  <h:outputText value="Enter some text"/>
</h:outputLabel>
<h:inputText id="changeInput" valueChangeListener="#{testForm.processValueChanged}"/>
<h:panelGrid binding="#{testForm.changePanel}" rendered="false">
   <h:outputText value="one"/>
   <h:outputText value="two"/>
</h:panelGrid>
<h:commandButton value="submit"/>
<p>
<h:commandButton value="naviagation test" action="foo"/>
<p>
<h:outputText value="favoriteSitesMap: #{favoriteSitesMap}"/>
<p>
<p>
<h:outputFormat value="favoriteSites: #{defaultFavoriteSites}"/>
<p>
<p> -
<%--<h:outputFormat value="exampleForm.user.favoriteSites: #{exampleForm.user.favoriteSites['4']}"/>--%>


<p>
<h:outputFormat value="newUser.favoriteSites: #{newUser.favoriteSites}"/>
<p>
<h:outputFormat value="newUser.balance: #{newUser.balance} = #{initParam.defaultBalance}"/>
<p>
<h:outputFormat value="#{richUser.favoriteNumbersMap}"/>
<p>
<h:outputText value="Java.net from favoriteSitesMap: #{richUser.favoriteSitesMap['java.net']}"/>
<p>
<h:outputText value="user.favoriteSitesMap: #{richUser.favoriteSitesMap}"/>
<p>
  <h:outputText value="#{richUser.favoriteSites}"/>
<p>
	<h:dataTable value="#{richUser.favoriteNumbers}" var="number">
    <h:column>
      <h:outputText value="#{number}"/>
    </h:column>
  </h:dataTable>
<p>
<%=((org.jia.examples.UserBean)session.getAttribute("richUser")).getFavoriteSitesMap().getClass().getName() %>
<p>
	<h:dataTable value="#{defaultUser.favoriteSites}" var="site">
    <f:facet name="header">
      <h:outputText value="Table header"/>
    </f:facet>

    <h:column>
      <f:facet name="header">
        <h:outputText value="Column header"/>
      </f:facet>
      <h:outputText value="#{site}"/>
    </h:column>

    <f:facet name="footer">
      <h:panelGroup>
        <h:commandButton value="Next page" action="myBean.nextPage"/>
        <h:commandButton value="Previous page" action="myBean.nextPage"/>
      </h:panelGroup>
    </f:facet>
  </h:dataTable>
<p>
<p>
	<h:dataTable value="#{defaultUser.favoriteSites}" var="site">
    <h:column>
      <h:outputText value="#{site}"/>
    </h:column>
  </h:dataTable>
<p>
<p>
	<h:dataTable value="#{richUser.favoriteSites2}" var="site">
    <h:column>
      <h:outputText value="#{site}"/>
    </h:column>
  </h:dataTable>
<p>
<p>
	<h:dataTable value="#{richUser.favoriteSites}" var="site">
    <h:column>
      <h:outputText value="#{site}"/>
    </h:column>
  </h:dataTable>
<p>
<p>
  <h:outputText  value="#{richUser.favoriteSites[0]}"/>
<p>
<p>
<h:outputText  value="The balance is #{defaults['defaultBalance'] + 50} or #{defaults.defaultBalance}"/>
<p>
<c:out value="" escapeXml="true"><h:outputText id="34" value="<foo>"/></c:out>
<p>
<h:outputText value="Rich user's balance is #{richUser.balance}"/>
</p>
<p>
<h:outputText value="TesForm user's balance is #{testForm.user.balance}"/>
</p>
<p>
<h:outputText value="Hello #{brokeUser.firstName} #{brokeUser.lastName}, you have a balance of $#{brokeUser.balance} and your favorite animal is #{brokeUser.favoriteAnimal}.!"/>
</p>
<p>
  <h:outputText value="Hello #{user.firstName} #{user.lastName} #{pageScope.foo.firstName}!"/>
</p>
<p>
       <h:outputFormat value="Hey {0}. This is a static value: {1}.  {0}, you''re using: {2}.">
         <f:param value="#{user.firstName}"/>
         <f:param value="#{hardcoded}"/>
         <f:param value="#{header['User-Agent']}"/>
       </h:outputFormat>

<p>
       <h:outputFormat value="Hey {0}, you were born on {1, date, medium}.">
         <f:param value="#{user.firstName}"/>
         <f:param value="#{user.dateOfBirth}"/>
       </h:outputFormat>
</h:form>
</f:view>
