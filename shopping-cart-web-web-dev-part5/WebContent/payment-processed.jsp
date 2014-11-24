<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<head>
<title>Scooby Doos Little Shop of Horrors</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/shopping.css"
	type="text/css" />
</head>
<body>
<f:view>
	<f:loadBundle var="msg" basename="Application-Resources" />
	<jsp:include page="header.jsp"></jsp:include>
	<p /><h:outputText id="headingOutTxt" value="#{msg.conf_txt_heading}"
		styleClass="headingOutputText" />
	<h:form id="confirmationFrm">
		<h:commandButton id="continueBtn" value="#{msg.btn_continue}"
			action="#{pc_Confirmation.restartShopping}" />
	</h:form>	
</f:view>
</body>
</html>
