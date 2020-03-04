<jsp:useBean id="b1" class="com.test.product" scope="request"/>
<jsp:setProperty property="productno" name="b1" value="${param.pno}"/>
<jsp:setProperty property="productname" name="b1" value="${param.pname}"/><h1>
<p>pno(using EL):${b1.productno}
<p>pno(using Getter):<%=b1.getProductno()%>
<p>pno(using GetProperty):<jsp:getProperty property="productno" name="b1"/>
<p>pname:${b1.productname}