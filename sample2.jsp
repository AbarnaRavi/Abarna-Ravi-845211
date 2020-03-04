
<body bgcolor="pink">

<jsp:declaration>
int add(int x,int y)
{
	return x+y;
}
</jsp:declaration>
<jsp:scriptlet>
out.println("inside scriptlets add:"+add(10,10));
</jsp:scriptlet>
<br>
<jsp:expression>"add:"+add(10,10)
</jsp:expression>
</body>