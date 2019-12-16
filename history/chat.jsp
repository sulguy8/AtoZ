<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<textarea id="his">
</textarea>
	<br> 아이디 :
	<input type="text" id="id">
	<br> 내용 :
	<input type="text" id="msg">
	<br>
	<button>전송</button>
	<script>
$(document).ready(function(){
	$('button').on('click',function(){
		if($('#id').val().trim().length<2){
			alert('아이디는 2글자 이상입니다.');
			$('#id').focus();
			return;
		}
		if($('#msg').val().trim().length<2){
			alert('내용은 1글자 이상입니다.');
			$('#msg').focus();
			return;
		}
		var param = "id=" + $('#id').val() + "&msg=" + $('#msg').val();
		$.ajax({
			url:'/msg',
			method:'POST',
			data:param,
			success:function(res){
				var text = '';
				for(var str of res){
					var id = str.split('$:v')[0];
					var msg = str.split('$:v')[1];
					text += id + ':' + msg;
				}
				$('#his').val(text);
			}
		})
		
	})
		setInterval(function(){
			$.ajax({
				url:'/msg',
				method:'POST',
				data:param,
				success:function(res){
					var text = '';
					for(var str of res){
						var id = str.split('$:v')[0];
						var msg = str.split('$:v')[1];
						text += id + ':' + msg;
					}
					$('#his').val(text);
				}
			})
		},1000)
})

</script>
</body>
</html>