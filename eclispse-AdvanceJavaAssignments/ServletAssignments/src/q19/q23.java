/* 23. Create an html page that has a textfield to take the user name. 
 * After submitting the page Servlet should be called that prints 
 * Welcome message with entered name like WELCOME SARJE. 
 */

package q19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home4")
public class q23 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h2> Welcome "+ req.getParameter("Name")+"</h2>");
			out.flush();
			out.close();
	}
	
			
}
