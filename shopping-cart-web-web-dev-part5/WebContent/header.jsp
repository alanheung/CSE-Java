<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:loadBundle var="msg" basename="Application-Resources" />
<div class="header">
	<h:outputText id="headerOutTxt" value="#{msg.title}" styleClass="headerOutputText" />	
</div>