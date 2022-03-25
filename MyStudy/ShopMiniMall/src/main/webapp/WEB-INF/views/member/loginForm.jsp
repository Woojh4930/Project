<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- member/loginForm.jsp -->
<script>
function validcheck() {
	//필수 항목 입력 확인
	var id = document.querySelector("#userid").value;
	var pw = document.querySelector("#passwd").value;
	if(id.length!=0){
	}else{
		alert("아이디 필수")
		event.preventDefault();
	}
	if(pw.length!=0){
	}else{
		alert("비밀번호 필수")
		event.preventDefault();
	}
	
}

</script>
<form action="login" method="post" onsubmit="validcheck()">
*아이디:<input type="text" name="userid" id="userid" width="50"><br>
*비밀번호:<input type="text" name="passwd" id="passwd" width="50"><br>
<input type="submit" value="로그인">
<input type="reset" value="취소">
<a href="SendMailServlet">아이디 찾기</a>
<br>
</form>
