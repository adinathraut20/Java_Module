package servlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class home1
 */
@WebServlet("/home1")
public class home1 extends HttpServlet {
	
    public home1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String s =(String) session.getAttribute("Uname");
		
		if(s != null) {
			response.setContentType("text/plain");
		PrintWriter out  = response.getWriter();
		out.print("Welcome "+s+" :)");
		out.flush();
		out.close();
		}else {
			response.sendRedirect("LoginPage.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
