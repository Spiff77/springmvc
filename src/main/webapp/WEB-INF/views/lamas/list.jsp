<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body> 
	<h1>Liste des Lamas</h1>
	<ul>
		<c:forEach items="${lamas}" var="lama">
		<li>(${lama.id}) ${lama.name}</li>
		</c:forEach>
	</ul>
</body>
</html>