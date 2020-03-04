<body bgcolor=lightgreen>
<%!
int a1=1000;
int add(int n,int m)
{
return n+m;
}
%>
<%!
int sub(int n,int m)
{
return n-m;
}
%>
<%
int a=100;
out.println("<h1>hello jsp");
out.println(a+" "+a1);
out.println("inside scriplets add:"+add(10,10));
%>
<%
out.println("sub:"+sub(10,5));
%>
add:<%=12+12 %>
<%="<h1>Good Day</h1>" %>
<%=a %>
Add method:<%=add(10,5) %>
Sub method:<%=sub(10,2) %>




</body>