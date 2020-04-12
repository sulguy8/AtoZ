<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<body>
	<input type="radio" name="name" value="홍길동">홍길동
	<br>
	<input type="radio" name="name" value="김길동">김길동
	<br>
	<input type="radio" name="name" value="이길동">이길동
	<br>
	<input type="radio" name="name" value="우길동">우길동
	<br>

	<script>
		var name = '${name}'
		$('input[type=radio]').on('click', function() {
			var param = 'name=' + this.value;
			$.ajax({
				url : '/test/name',
				method : 'POST',
				data : param,
				success : function(res) {
					alert(res.msg);
					$('input[value=' + name + ']').attr('checked', true);
				}
			})
		});
	</script>
</body>
</html>