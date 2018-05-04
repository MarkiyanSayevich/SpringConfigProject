<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${ pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<h2> Here is your profile , ${ name }</h2>
	<a href="${ pageContext.request.contextPath }/edit">Go to edit</a>
</body>
</html>