<body bgcolor="pink" text="blue">
<h1>Java bean Details</h1>
<jsp:useBean id="b1"
class="com.test.product" scope="session"/>
<h1>
<jsp:getProperty property="productno" name="b1" />
<jsp:getProperty property="productname" name="b1" />
</h1>