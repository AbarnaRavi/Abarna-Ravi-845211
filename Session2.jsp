<%@page session="true"%>
<% out.println("Session Object:"+session);
String UserName=request.getParameter("n1");
String Password=request.getParameter("n2");
session.setAttribute("SessionUser",UserName);
session.setAttribute("SessionPassword",Password);
out.println("<h1>Welcome"+UserName+"!");
out.println("<a href=Session3.jsp>Next Page</a>");

%>
