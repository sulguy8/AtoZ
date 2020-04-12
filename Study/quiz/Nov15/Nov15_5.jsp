<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="test"></div>
<input type="text" name="id">
<input type="text" id="input1">
<script>
/* 
id가 test인 객체를 접근하는 코드
input 태그이면서 name이 id인 객체
input 태그이면서 id가  input1인 객체 
*/

document.querySelector('#test').innerText = '안녕?'; 
document.querySelector('input[name=id]').value = '반가링';
document.querySelector('input[id=input1]').value = '수고링';
</script>

</body>
</html>