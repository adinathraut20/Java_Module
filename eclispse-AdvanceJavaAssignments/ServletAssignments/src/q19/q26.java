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
	
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(true);
		Integer c = (Integer) session.getAttribute("c");
		if(c == null || c == 0) {
			c=1;
			session.setAttribute("c", c);
		}else {
			c++;
			session.setAttribute("c", c);
		}
		
		Integer count = (Integer)req.getServletContext().getAttribute("count");
		if(count == null || count == 0) {
			count = 1;
			req.getServletContext().setAttribute("count", count);
			
		}else {
			count++;
			req.getServletContext().setAttribute("count", c); 
		}
		
		out.print("<h1>User Visited Count : "+count+" "+c+"</h1>");
		out.flush();
		out.close();
	}
}
