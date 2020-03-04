<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="8754249806"/>
<sql:query dataSource="${snapshot}" var="res">
select*from emp1 where salary>3000;
</sql:query>
<table border="1">
<tr>
<th>empno</th>
<th>empname</th>
<th>salary</th>
</tr>
<c:forEach var="row1" items="${res.rows}">
<tr>
<td><c:out value="${row1.empno}" /></td>
<td><c:out value="${row1.empname}" /></td>
<td><c:out value="${row1.salary}" /></td>
</tr>


</c:forEach>
</table>