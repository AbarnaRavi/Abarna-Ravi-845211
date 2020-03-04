<body bgcolor="lightblue" text="black">
<h1>Java Bean Details:</h1>
<jsp:useBean id="b1" class="com.test.product" scope="session"/>
<jsp:setProperty name="b1" property="*"/>
<h1>
<jsp:getProperty name="b1" property="productno"/>
<jsp:getProperty name="b1" property="productname"/>
</h1>
<h1>
pno:<%=b1.getProductno()%>
pname:<%=b1.getProductname() %></h1></body>
