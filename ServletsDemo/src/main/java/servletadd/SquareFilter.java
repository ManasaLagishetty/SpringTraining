package servletadd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class SquareFilter
 */
@WebFilter("/square")
public class SquareFilter extends HttpFilter implements Filter {
       

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req= (HttpServletRequest) request;
		
		PrintWriter out=response.getWriter();
		
		
		int num=(int)req.getAttribute("i");
		
		if(num<10)
		
		chain.doFilter(request, response);
		
		else
			
			out.print("addition of two numbers must be less than 10");
			
			
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
