<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
RequestDispatcher rd = request.getRequestDispatcher("/target?");
rd.forward(request, response);
%>