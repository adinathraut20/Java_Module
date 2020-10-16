/* 19. Create a servlet that prints WELCOME TO SERVLET WORLD using html's
 *  heading tag. 
 */

package q19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class q19 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.print("<h1>Welcome To SERVLET WORLD</h1>");
			out.flush();
			out.close();
	}
		
}
