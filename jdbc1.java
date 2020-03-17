

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class jdbc1
 */
public class jdbc1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jdbc1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		 pw.println("<h1 align=center>Viewing "
		    		+ "the Records</h1>");
		  pw.println("<hr color=red>");
		  pw.println("<table border=6 bgcolor=pink "
		  		+ "align=center bordercolor=red>"
		  		+ "<tr><th>Eno</th><th>EmpName</th>"
		  		+ "<th>Salary</th></tr>");
		  try
	 	  {
	 		  Class.forName("com.mysql.jdbc.Driver");
	 Connection con=(Connection) DriverManager.getConnection
	("jdbc:mysql://localhost:3306/test","root","8754249806");

	 Statement s = con.createStatement();
	 ResultSet rs=s.executeQuery("select * from emp1");
	   while(rs.next())
	    {
	    pw.println("<tr>");
	    pw.println("<td>"+rs.getString(1));
	    pw.println("<td>"+rs.getString("empname"));
	    pw.println("<td>"+rs.getString(3)); 	  
	    pw.println("</tr>"); 	 	
	    }
	  pw.println("</table>");
	    rs.close();
	    s.close();
	    con.close(); 	 	 

	 	  }
		     catch(Exception e)
		  {
	 	 	    pw.println(e);
		  }
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
