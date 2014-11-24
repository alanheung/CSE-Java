<html>
<head>
</head>
<body>

<%--
If you use extension mapping (".faces"), you can not configure
a JSF page as the welcome file in web.xml. Conseqeuntly, you need
to forward from the default page.
--%>

<jsp:forward page="ExampleIndex.faces" />

</body>
</html>
