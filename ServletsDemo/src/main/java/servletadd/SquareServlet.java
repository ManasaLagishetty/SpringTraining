package servletadd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int num=(int)req.getAttribute("i");
		
		int sq = num*num;
		
		PrintWriter out=res.getWriter();
		
		out.print("squre of " + num +" is " +sq);
		
		
	}

}
