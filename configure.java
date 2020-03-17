package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 
 */
@webservlet
{
	urlpattern={"/configure"},
			initparam=
	
}
public class configure extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public configure() {
        //super();
        // TODO Auto-generated constructor stub
    }
        String v1,t1;
    	public void init(ServletConfig Config) 
    			throws ServletException
    	{
    		//context==>config
    		super.init(Config);//init()
    		v1=Config.getInitParameter("Company");
    		 t1=Config.getInitParameter("Venue");
    		
    	}
    	
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		  ServletConfig con1 = getServletConfig();
	        out.println("Company:" + con1.
	        		getInitParameter("Company"));
	        out.println("Venue:" +con1.
	        		getInitParameter("Venue"));
	        out.println("<h1>Venue: "+t1);
			    out.println("<h1>Company: "+v1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
