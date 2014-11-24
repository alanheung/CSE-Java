<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title> DVD Catalog </title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles/styles.css" type="text/css" />
</head>
<%
	// perform a trial set to France-French
	Locale	frn = new Locale( "fr" );
	Locale.setDefault( frn );
%>
<body>
<f:view>
<f:loadBundle basename="com.etretatlogiciels.dvdcatalog.messages" var="msg" />
<h:form>
	<table>
	<tr>
		<td> </td>
		<td width="10"> &nbsp; </td>
		<td></td>
	</tr>
	<tr>
		<td colspan="3">
			<h2>
				<h:outputText value="#{msg['dvdcatalog.title']}" />
			</h2>
		</td>
	</tr>
	<tr>
		<td colspan="3" align="center">
			<h:graphicImage value="#{msg['dvdcatalog.logo']}" />
		</td>
	</tr>
	<tr>
		<td colspan="3"> &nbsp;
			<br />
		</td>
	</tr>
	<tr>
		<td align="right">
			<h:outputText value="#{msg['login.username']}" />
		</td>
		<td> </td>
		<td> [edit field] </td>
	</tr>
	<tr>
		<td align="right">
			<h:outputText value="#{msg['login.password']}" />
		</td>
		<td></td>
		<td> [edit field] </td>
	</tr>
	<tr>
		<td colspan="3"> &nbsp; </td>
	</tr>
	<tr>
		<td colspan="3" align="center"> [button] </td>
	</tr>
	</table>
</h:form>
</f:view>
</body>
</html>