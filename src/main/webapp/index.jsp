<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>메인 페이지</title>
</head>
<body>
	<%=new Date()%>
	<h2>Hello World</h2>
	<a href="t1">링크1</a><br/>
	<a href="t2">링크2</a><br/>	
	<a href="t3">링크3</a><br/>	
	<a href="t4?name=코끼리">링크4</a><br/>
	<a href="t5?name=코끼리&age=30">링크5</a><br/>
	<a href="t6?name=독수리&age=30">링크6</a><br/>	
	<a href="t7">링크7</a><br/>
	<a href="t8?name=대나무&age=1500">링크8</a><br/>	
	<a href="t9?name=강아지&age=5">링크9</a><br/>		
	<a href="t10">링크10</a><br/>
	<a href="t11">링크11</a><br/>
	<form action="t12"> 
      <input type="text" name = "name">
      <input type="text" name = "age">    
      <input type="submit" value="전송">
   </form>
</body>