<%
	//String userName = new String(request.getParameter("un"));
	String userName = request.getParameter("un");
	String userPass = request.getParameter("pw");
	
	if(userName.equals("ram") && userPass.equals("123")){
		session.setAttribute("uname",userName);
		response.sendRedirect("manageFlight.jsp");
	}else{
		response.sendRedirect("login.jsp?error_msg=Invalid Credentials !!!");
	}
%>