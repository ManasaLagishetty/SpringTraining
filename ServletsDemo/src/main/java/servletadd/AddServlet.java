package servletadd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int num3 = num1+num2;
		
		try {
			PrintWriter out=res.getWriter();
			
			out.print(num3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  req.setAttribute("i", num3);
         RequestDispatcher rd=req.getRequestDispatcher("square");
         rd.forward(req, res);
		
	}

}
