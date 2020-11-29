/* 26. Create a Servlet that prints number of visits by a particular user. 
 */

package q19;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main26")
public class q26 extends HttpServlet{
	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(true);
		String uname = req.getParameter("uname");
		session.setAttribute("uname", uname);
		
		if(uname.equals("Adinath") || session.getAttribute("uname").equals("Adinath")) {		
			
			Integer count = (Integer)req.getServletContext().getAttribute("count");
			if(count == null || count == 0) {
				count = 1;
				req.getServletContext().setAttribute("count", count);
				out.print("<h1>User Visited Count : "+count+" </h1>");
				out.print("<br><h1>Hiii "+uname+"</h1>");
				out.flush();
				out.close();
			}else {
				count++;
				req.getServletContext().setAttribute("count", count); 
				out.print("<h1>User Visited Count : "+count+"</h1>");
				out.print("<br><h1>Welcome Back!!! "+uname+"</h1>");
				out.flush();
				out.close();
			}
		}
		out.print("<br><h1>Hiii "+uname+"</h1>");
		out.flush();
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("indexq26.html");
		HttpSession session = req.getSession(false);

		System.out.println(session);
		
		if(session == null || session.getAttribute("uname") == null) {
			//resp.sendRedirect("indexq26.html");
		}
		String uname = req.getParameter("uname");
		
		if(uname.equals("Adinath") || session.getAttribute("uname").equals("Adinath")) {		
			PrintWriter out = resp.getWriter();
			Integer count = (Integer)req.getServletContext().getAttribute("count");
			if(count == null || count == 0) {
				count = 1;
				req.getServletContext().setAttribute("count", count);
				out.print("<h1>User Visited Count : "+count+" </h1>");
				out.print("<br><h1>Hiii "+uname+"</h1>");
				out.flush();
				out.close();
			}else {
				count++;
				req.getServletContext().setAttribute("count", count); 
				out.print("<h1>User Visited Count : "+count+"</h1>");
				out.print("<br><h1>Welcome Back!!! "+uname+"</h1>");
				out.flush();
				out.close();
			}
		}
	}
}
