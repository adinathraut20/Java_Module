<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	session.removeAttribute("uname");
	session.invalidate();
	response.sendRedirect("login.jsp?error_msg=Successfully Logout.");
%>