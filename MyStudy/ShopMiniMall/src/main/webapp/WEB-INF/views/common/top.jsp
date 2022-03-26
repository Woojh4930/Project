<%@page import="com.dto.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  
  
  <c:if test="${sessionScope.login!=null}">
	<a href="LogoutServlet">로그아웃</a>
	<a href="MyPageServlet">mypage</a>
	<a href="GoodsCartListServlet">장바구니 목록</a>
  </c:if>
  <c:if test="${sessionScope.login==null}">
	<a href="loginUI">로그인</a>
	<a href="memberUI">회원가입</a>
  </c:if>
