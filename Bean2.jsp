<body bgcolor="yellow" text="blue">
<h1>Java Bean Details:</h1>
<jsp:useBean id="b1" class="com.test.product" scope="session"/>
<jsp:setProperty name="b1" property="productno" param="a1"/>
<jsp:setProperty name="b1" property="productname" param="b1"/>
<h1>pno:
<jsp:getProperty name="b1" property="productno"/></h1>
<h1>PName:<jsp:getProperty name="b1" property="productname"/></h1>
<a href="Bean3.jsp">Next Page</a>
</body>