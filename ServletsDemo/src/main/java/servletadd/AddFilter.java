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
 * Servlet Filter implementation class AddFilter
 */
@WebFilter("/add")
public class AddFilter extends HttpFilter implements Filter {
       
   
    public AddFilter() {
        super();
       
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req= (HttpServletRequest) request;
		
		
		
		int num=Integer.parseInt(req.getParameter("num1"));
		
		PrintWriter out=response.getWriter();
		
		
		if(num>0)
		chain.doFilter(request, response);
		else
			out.print(num+" is not a valid input");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
