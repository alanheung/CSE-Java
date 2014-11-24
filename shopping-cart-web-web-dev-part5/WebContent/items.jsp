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
	<p /><h:outputText id="headingOutTxt" value="#{msg.items_txt_heading}"
		styleClass="headingOutputText" /> <h:form id="itemListFrm">
		<h:dataTable id="itemsTbl" var="items" value="#{pc_Items.items}"
			binding="#{pc_Items.itemsTable}" styleClass="dataTable"
			columnClasses="dataTableCol1" rowClasses="dataTableRow1"
			headerClass="dataTableHeader">
			<h:column id="nameCol">
				<f:facet name="header">
					<h:outputText id="nameHeaderOutTxt"
						value="#{msg.items_txt_name_col_header}" />
				</f:facet>
				<h:outputText id="nameOutTxt" value="#{items.name}" />
			</h:column>
			<h:column id="descriptionCol">
				<f:facet name="header">
					<h:outputText id="descriptionHeaderOutTxt"
						value="#{msg.items_txt_description_col_header}" />
				</f:facet>
				<h:outputText id="descriptionOutTxt" value="#{items.description}" />
			</h:column>
			<h:column id="priceCol">
				<f:facet name="header">
					<h:outputText id="priceHeaderOutTxt"
						value="#{msg.items_txt_price_col_header}" />
				</f:facet>
				<h:outputText id="priceOutTxt" value="#{items.price}">
					<f:convertNumber pattern="#{msg.currency_pattern}" />
				</h:outputText>
			</h:column>
			<h:column id="addActionCol">
				<h:commandLink id="buyLnk" value="#{msg.items_lnk_buy}"
					action="#{pc_Items.addItemToBasket}" />
			</h:column>
		</h:dataTable>
		<p/>
		<h:dataTable id="basketTbl" var="basketItem"
			value="#{shoppingViewHelper.basket.items}"
			binding="#{pc_Items.basketTable}">
			<h:column id="basketCol">
				<f:facet name="header">
					<h:outputText id="basketTblHeaderOutTxt"
						value="#{msg.items_txt_basket_header}" />
				</f:facet>
				<h:outputText id="basketItemOutTxt" value="#{basketItem.name}" />
			</h:column>
			<h:column id="removeActionCol">
				<h:commandLink id="removeLnk" value="#{msg.items_lnk_remove}"
					action="#{pc_Items.removeItemFromBasket}" />
			</h:column>
		</h:dataTable>
		<p />
		<h:commandButton id="checkoutBtn" value="#{msg.btn_checkout}" action="#{pc_Items.checkout}" />
	</h:form>
</f:view>
</body>
</html>
