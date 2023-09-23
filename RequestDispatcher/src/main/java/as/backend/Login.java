package as.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		if(myemail.equals("sirsataakash409@gmail.com") && mypass.equals("aakash123")) {
			
			 req.setAttribute("name_key", "Aakash Sirsat");
			 RequestDispatcher rd =	req.getRequestDispatcher("/profile.jsp");
			 rd.forward(req, resp);
			 
		}
		else {
			
			resp.setContentType("text/html");
			out.print("<h2 style = 'color:red'>Email Id or Password is Wrong</h2>");			
			RequestDispatcher rd =	req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			
		}
		
	}
	
	

}
