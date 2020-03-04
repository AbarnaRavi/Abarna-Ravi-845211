<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="s" value="${param.UserName}"/>
We Welcome<br>
<c:out value="${s}"/>