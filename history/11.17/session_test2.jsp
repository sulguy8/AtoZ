<%@page import="java.util.Enumeration"%>
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
	/* Object getData = session.getAttribute("Testing"); // 오브젝트 형태로 받아오기때문에 형변환해야함.*/
	String getDataStr = (String)session.getAttribute("Testing");
	
	int getDataInt = (Integer)application.getAttribute("MyData");
	
	out.println(getDataStr + "<br>");
	out.println(getDataInt + "<br>");
%>

<%
	session.setAttribute("Enum", "나는 이넘이다");
	
	String name="";
	String value="";

	Enumeration enumTest = session.getAttributeNames();

	while(enumTest.hasMoreElements()){
		name = enumTest.nextElement().toString();
		value = session.getAttribute(name).toString();
		
		out.println("key : " + name + "<br>");
		out.println("value : " + value + "<br>");
	
	}
%>
</body>
</html>