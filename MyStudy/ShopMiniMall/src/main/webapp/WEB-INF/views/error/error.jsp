<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Error 페이지</h1>
<br>
<%
	out.print(exception);
%>
요청경로:${message}<br>
<a href="/app/main">메인화면으로</a>

</body>
</html>