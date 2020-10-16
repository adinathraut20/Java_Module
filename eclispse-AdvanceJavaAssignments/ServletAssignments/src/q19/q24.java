/* 24.  Create an html page Calci.html that has a GUI to take two numbers, to make choice from addition,
 *  subtraction, multiplication or division and a submit button. After submitting the form, request should
 *   be generated for ArithmeticServlet. This servlet should get two numbers entered by the user and his choice. 
 *   Perform the requested operation and display the result in the same servlet.
 */

package q19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home5")
public class q24 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s = req.getParameter("calci");
		String num1 = req.getParameter("num1");
		float n1 =  Float.parseFloat(num1);
		String num2 = req.getParameter("num2");
		float n2 =  Float.parseFloat(num2);
		PrintWriter out = resp.getWriter();

		switch(s) {
			case "add":
						float n = n1 + n2;
						out.print("<h1> Addition of "+n1+", "+n2+" : "+n+"</h1>");
						break;
			case "sub":
						n = n1 - n2;
						out.print("<h1> Substraction of "+n1+", "+n2+" : "+n+"</h1>");
						break;
			case "mul":
						n = n1 * n2;
						out.print("<h1> Multiplication of "+n1+", "+n2+" : "+n+"</h1>");
						break;
			case "div": 
						n = n1 / n2;
						out.print("<h1> Division of "+n1+", "+n2+" : "+n+"</h1>");
						break;
			default : 
						out.print("<h1> No Operation Selected</h1>");
						break;
		}
		out.flush();
		out.close();
	}	
		
		
	
}
