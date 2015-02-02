<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style type="text/css">
        table.usersTable { border-collapse:collapse; }
        table.usersTable td, table.myTable th { border:1px solid black;padding:5px; }
    </style>
</head>
<body>
<h1>User list</h1>
<c:if test="${not empty users}">
    <table class="usersTable">
        <c:forEach var="o" items="${users}">
            <tr>
                <td>${o.firstName}</td>
                <td>${o.lastName}</td>
            </tr>
        </c:forEach>
    </table>

</c:if>
<a href="users/add">Add user</a>

</body>
</html>