<%@page import="Pack01.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>호랑이</h1>
	<h1>${name}</h1> 
	<h1>${age}</h1> 
	<%--<h1>${ppp.getname()}</h1> --%>
	<h1>${mm.get(0)}</h1>
	<h1>${mm.get(1)}</h1>
	<h1>${mm.get(2)}</h1>	
	<br>
	<%
		Person person = (Person) request.getAttribute("ppp");
	%>
	<%=person.getName() %>
</body>
</html>