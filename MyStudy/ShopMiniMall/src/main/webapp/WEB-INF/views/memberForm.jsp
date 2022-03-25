<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원등록 화면입니다.</h1>
<jsp:include page="common/top.jsp" flush="true" /><br>
<jsp:include page="common/menu.jsp" flush="true" />
<a href="main">메인화면으로 가기</a>
<hr>
<jsp:include page="member/memberForm.jsp"></jsp:include>
</body>
</html>