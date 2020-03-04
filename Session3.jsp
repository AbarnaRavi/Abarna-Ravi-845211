<% 
String UserName=(String)
session.getAttribute("SessionUser");
String Password=(String)session.getAttribute("SessionPassword");
out.println("<h1>Your Password:"+Password);
session.invalidate();
out.println("<a href=Session1.html>Back</a>");
%>