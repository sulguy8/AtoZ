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
<button id="start">게임시작</button>
<div id="rDiv"></div>
<script>
	$(document).ready(function(){
		$('#start').on('click',function(){
			$.ajax({	
				url : '/init',
				method: 'GET',	
				success:function(res){
					if(res=="complete"){
						alert('게임을 시작하지!');
						$('#start').css('display','none');
						var html = '<input type="text" id="source"><button id="game">전송</button>';
						$('#rDiv').html(html);
						$('#game').on('click',function(){
							var param = 'source=' + $('#source').val();
/* 							if(isNaN(parseInt(param))){
								alert('숫자를 입력해주세요.');
								return false;
							} // isNanN은 숫자라고 물어보는 기본객체 숫자가 아닐땐 true*/
							$.ajax({	
								url : '/game',
								method: 'POST',	
								data : param,
								success:function(res){
									console.log(res);
									var msg = res.ball + res.strike + res.out;
									if(res.strike == '3'){
										alert('정답입니다^^');
									} else {
										alert('ball : '+ res.ball + ', ' + 'strike : ' + res.strike + ', ' + 'out : ' + res.out);
									}
								}
							})		
						});
					}
				}
			})
		})
	})
</script>

</body>
</html>