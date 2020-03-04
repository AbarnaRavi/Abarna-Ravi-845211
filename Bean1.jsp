<body bgcolor="lightpink" text="black">
<h1>Java Bean Details:</h1>
<jsp:useBean id="s1" class="com.test.product" scope="request"/>
<jsp:setProperty name="s1" property="productno" value="1001"/>
<jsp:setProperty name="s1" property="productname" value="Dell laptop"/>
<h1>
pNo:
<jsp:getProperty name="s1" property="productno"/>
pName<jsp:getProperty name="s1" property="productname"/></h1>
</body>