
<body bgcolor="MEDIUMSEAGREEN" >
<% 
out.println("Session Object: "+session);
String empno=request.getParameter("empno");
String empname=request.getParameter("empname");
String salary =request.getParameter("salary");
out.println("<h1> Name:"+empno);
out.println("<h1> Dept:"+empname);
out.println("<h1> Salary: "+salary);

%>
</body>