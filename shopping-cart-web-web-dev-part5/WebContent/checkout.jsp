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
	<p /><h:outputText id="headingOutTxt"
		value="#{msg.checkout_txt_heading}" styleClass="headingOutputText" />
	<p><h:outputText id="headingDetailOutTxt"
		styleClass="headingOutputText" value="#{msg.checkout_txt_detail}" /></p>
	<h:form id="checkoutFrm">
		<h:dataTable id="basketTbl" var="basketItem" styleClass="dataTable"
			columnClasses="dataTableCol1" rowClasses="dataTableRow1"
			headerClass="dataTableHeader"
			value="#{shoppingViewHelper.basket.items}">
			<h:column id="nameCol">
				<f:facet name="header">
					<h:outputText id="nameHeaderOutTxt"
						value="#{msg.checkout_txt_name_col_header}" />
				</f:facet>
				<h:outputText id="nameOutTxt" value="#{basketItem.name}" />
			</h:column>
			<h:column id="descriptionCol">
				<f:facet name="header">
					<h:outputText id="descriptionHeaderOutTxt"
						value="#{msg.checkout_txt_description_col_header}" />
				</f:facet>
				<h:outputText id="descriptionOutTxt"
					value="#{basketItem.description}" />
			</h:column>
			<h:column id="priceCol">
				<f:facet name="header">
					<h:outputText id="priceHeaderOutTxt"
						value="#{msg.checkout_txt_price_col_header}" />
				</f:facet>
				<h:outputText id="priceOutTxt" value="#{basketItem.price}">
					<f:convertNumber pattern="#{msg.currency_pattern}" />
				</h:outputText>
			</h:column>
		</h:dataTable>
		<h:panelGrid id="totalPnlGrid" columns="2">
			<h:outputText id="totalOutTxt" value="#{msg.checkout_txt_total}"
				styleClass="headingOutputText" />
			<h:outputText id="totalResultOutTxt" value="#{pc_Checkout.total}"
				styleClass="headingOutputText">
				<f:convertNumber pattern="#{msg.currency_pattern}" />
			</h:outputText>
		</h:panelGrid>
		<h:messages id="processPaymentMsg" />
		<h:commandButton id="processPaymentBtn" value="#{msg.btn_pay}"
			action="#{pc_Checkout.processPayment}" />
		<h:commandButton id="cancelBtn" value="#{msg.btn_cancel}"
			action="#{pc_Checkout.cancelOrder}"
			onclick="return confirm('This will cancel your order, are you sure you want to proceed?');" />
	</h:form>
</f:view>
</body>
</html>
