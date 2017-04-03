<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Note</title>
</head>
<body>
<table>
    <tr>
        <c:forEach items="${notes}" var="note">
            <td>${note.name}</td>
        </c:forEach>
    </tr>
    <tr>
        <c:forEach items="${notes}" var="note">
            <td>${note.content}</td>
        </c:forEach>
    </tr>
    <tr>
        <c:forEach items="${notes}" var="note">
            <td>${note.dateOfCreation}</td>
        </c:forEach>
    </tr>
</table>
</body>
</html>