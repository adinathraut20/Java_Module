

<%@page import="service.FlightServiceImple"%>
<%@page import="service.FlightService"%>
<%
	if(session.getAttribute("uname") == null){
		response.sendRedirect("login.jsp?error_msg=Login Again!!!");
	}
	
	int flight_no = Integer.parseInt(request.getParameter("flightId"));
	FlightService flightService = new FlightServiceImple();
	flightService.removeFlight(flight_no);
	response.sendRedirect("manageFlight.jsp");
%>