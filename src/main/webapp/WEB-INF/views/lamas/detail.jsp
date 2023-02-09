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
	<h1>Detail d'un lama</h1>
	<ul>
		<li>ID: ${lama.id}</li>
		<li>Name: ${lama.name}</li>
	</ul>
</body>
</html>