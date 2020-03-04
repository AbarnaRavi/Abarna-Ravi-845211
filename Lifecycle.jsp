<%!
int counter=10;
public void jspinit()
{
System.out.println("Init method");
}
%>
<%
System.out.println("Service method");
counter++;
%>
<h2>JSP Life Cycle:Request counter</h2>
<p>This page has been called <%=counter%>
times</p>
<%!
public void jspDestroy1()
{
System.out.println("destroy method");
}
%>