package Oct10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mainpage")
public class MyServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	//@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		resp.setContentType("text/plain");
//		PrintWriter out  = resp.getWriter();
//		out.print("Hello Serveltttt");
//		System.out.println("Service called--------");
//		out.flush();
//		out.close();
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String nm = req.getParameter("uname");
			resp.setContentType("text/html");
			PrintWriter out  = resp.getWriter();
			out.print(nm);
			out.print("<h1>doPost</h1>");
			System.out.print("doPost");
			out.flush();
			out.close();
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nm = req.getParameter("uname");
		resp.setContentType("text/html");
		PrintWriter out  = resp.getWriter();
		out.print(nm);
		out.print("<h1>doGet</h1>");
		System.out.print("do get");
		out.flush();
		out.close();
	}
	
		
}
