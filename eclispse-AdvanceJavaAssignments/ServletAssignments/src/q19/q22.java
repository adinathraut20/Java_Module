/* 22. Create an html page having two buttons first labeled with 
 * GET REQUEST DEMO and second with POST REQUEST DEMO. Create a Servlet
 * that overrides both doGet and doPost methods. After clicking first
 *  button doGet method should be called that prints “YOU SELECTED GET
 *   TYPE REQUEST”. After clicking second button doPost method should 
 *   be called that prints “YOU SELECTED POST TYPE REQUEST”.
 */

package q19;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home3")
public class q22 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//resp.sendRedirect("http://localhost:8080/ServletAssignments/home4?Name=Adinath");
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h2> YOU SELECTED GET TYPE REQUEST </h2>");
			out.flush();
			out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h2> YOU SELECTED POST TYPE REQUEST </h2>");
			out.flush();
			out.close();
	}
	
		

}
