package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class sample
 */
public class sample extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public sample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String user=request.getParameter("u1");
		String pass=request.getParameter("p1");
		String gen=request.getParameter("r1");
		out.println("<h1>Username:"+user+"Password:"+pass+" "+"Gender:"+gen);
		String[] lang=request.getParameterValues("c1");
		for(int i=0;i<lang.length;i++)
		{
			out.println("<h1>Language:"+lang[i]);
		}
	 String[] qual=request.getParameterValues("s1");
	 for(int i=0;i<qual.length;i++)
	 {
		 out.println("<h1>Qualification:"+qual[i]);
	 }
	}
	
		}
		
		
	


