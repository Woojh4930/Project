<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>부서자세히화면</h1>
<form action="update" method="post">
부서번호:<input type="text" name="deptno" value="${retrieve.deptno}" readonly="readonly"><br>
부서명:<input type="text" name="dname" value="${retrieve.dname}"><br>
부서위치:<input type="text" name="loc" value="${retrieve.loc}"><br>
<input type="submit" value="수정">
</form>
<a href="delete?deptno=${retrieve.deptno}">삭제</a>
</body>
</html>