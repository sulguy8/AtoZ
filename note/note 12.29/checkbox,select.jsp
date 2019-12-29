<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<body>
<div>
게임<input type="checkbox" name="hobby" value="게임" ><br>
축구<input type="checkbox" name="hobby" value="축구"><br>
영화<input type="checkbox" name="hobby" value="영화"><br>
음악<input type="checkbox" name="hobby" value="음악"><br>
<input type="text" id="searchStr">
<button>하이</button>
</div>

<div>
	<select id="sido">
		<option value="인천">인천</option>
		<option value="서울">서울</option>
	</select>
	<input type="text" id="selectSido">
	<button onclick="selectedSido()">선택</button>
</div>


<script>
var hobby = "축구";
var inputs = document.querySelectorAll('input');
for(var input of inputs){
	if(input.name=='hobby'&&input.value==hobby){
		input.checked = true;
	}
}

var btn = document.querySelector('button');
btn.onclick = function(){
	var checks = document.querySelectorAll('[name=hobby]:checked');
	if(checks.length == 0){
		alert('하나는 선택해야지?');
		return;
	}
var searchStr = document.querySelector('#searchStr');
	if(searchStr.value.trim().length<1){
		alert('뭐라도 적지?');
		return;
	}
}


/* document.querySelector('input[name=hobby][value=영화]').checked = true;
document.querySelector('input[name=hobby][value=축구]').checked = true;
var list = document.querySelectorAll('input[name=hobby]:checked');
for(var st of list){
alert(st.value);
} */  
</script>
</body>
</html>