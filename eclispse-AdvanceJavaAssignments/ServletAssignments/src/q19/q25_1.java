/* 25. Create an html page to take the name. Take this entered user name on a servlet. 
 * Create another servlet that prints the name taken by the first servlet.
 */

package q19;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main25")
public class q25_1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect("index25.html");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String name = req.getParameter("name");
		RequestDispatcher rd = req.getRequestDispatcher("/Main25_1");
		rd.forward(req, resp);
		
	}

}
