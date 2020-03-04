<body bgcolor="tomatoorange" text="white">
<%@ include file="Sample1.jsp" %>
<h1>Next....</h1>
<jsp:include page="Inc1.jsp"/>
<jsp:include page="Inc1.jsp">
<jsp:param name="Company" value="CTS">
<jsp:param name="Time" value="9:00AM-6.00PM"/>
</jsp:include>
</body>