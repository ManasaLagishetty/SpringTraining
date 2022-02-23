package com.evoke.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname =request.getParameter("uname");
		String password =request.getParameter("password");
		
		
		
		if(uname.equals("manasa")&& password.equals("evoke")) {
			
		 	HttpSession session=request.getSession();
		 	session.setAttribute("username", uname);
		   response.sendRedirect("welcome.jsp");
		}
		
		else 
			
			response.sendRedirect("login.html");
			
		
		
	}

	
}
