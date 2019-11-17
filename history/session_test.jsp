<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("Testing", "반갑쓰");
	application.setAttribute("MyData", 10);
%>
세션값을 설정하는 페이지 입니다.
<button onclick="goPage()">페이지 이동</button>

<script>
	function goPage(){
	location.href = '/session_test2.jsp';
	}
</script>
</body>
</html>