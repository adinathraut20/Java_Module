package servlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home1")
public class home1 extends HttpServlet {
	
    public home1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie arr[] = request.getCookies();
		
		
		if(arr != null) {
			response.setContentType("text/plain");
		PrintWriter out  = response.getWriter();
		out.print("Welcome "+arr[0].getValue()+" :)");
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
