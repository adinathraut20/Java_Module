/* 20. Create a servlet that displays system date in the dd/mm/yyyy  format.
 * 
 */

package q19;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home1")
public class q20 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Current Date "+dtf.format(now)+"</h1>");
		out.flush();
		out.close();
	}
	
		

}
