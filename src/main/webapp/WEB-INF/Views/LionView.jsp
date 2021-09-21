<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>  
	<%-- <h1>사자</h1>
	<h1>${name}</h1> 
	<h1>${age}</h1>
	--%>
	<%
		String name = (String)request.getAttribute("name"); 
		String age = (String)request.getAttribute("age");
	%>
	<%= name %>
	<%= age %> 
</body>
</html>