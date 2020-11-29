<%@page import="service.FlightServiceImple"%>
<%@page import="service.FlightService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="flight" class="dto.Flight" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>

<%
	if(session.getAttribute("uname") == null){
		response.sendRedirect("login.jsp?error_msg=Login Again!!!");
	}
	
	FlightService flightService = new FlightServiceImple();
	int i = flightService.editFlight(flight);
	if(i==0){
		String str = "flight_update.jsp?error_msg=Source and Destination Cannot be Same!!!&flightId="+flight.getFlightId();
		response.sendRedirect(str);
	}else{
	response.sendRedirect("manageFlight.jsp");
	}
%>
