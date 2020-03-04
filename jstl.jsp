<%@taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="cts"%>
<cts:out value="DONT SLEEP!"/>
<cts:set var="a" value="Hello Students!!!"/>
<cts:out value="${a}"/>
<cts:forEach var="n" begin="3" end="8" step="2">
<cts:out value="${n}"/>
<br>
</cts:forEach>

<cts:set var="loc" val="chennai"/>
<cts:if test="${loc=='chennai'}" var="b">
<p>My Location is<cts:out value="${loc}"/>
<p>Result:<cts:out value="${b}"/></p></cts:if>