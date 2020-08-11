<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Quadratic</title>
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<h2>ax&sup2; + bx + c = 0</h2>
<div>
    <form name="calculation" method="post">
        <input input type="number" required="required" step="0.01" name="a" placeholder="a" />
        <input input type="number" required="required" step="0.01" name="b" placeholder="b" />
        <input input type="number" required="required" step="0.01" name="c" placeholder="c" />
        <button type="submit">Calculate</button>
    </form>
</div>

<table id="result">
    <tr>
        <th>№</th>
        <th>a</th>
        <th>b</th>
        <th>c</th>
        <th>result</th>
    </tr>
    <c:forEach items="${calculations}" var="calculation">
        <tr>
            <td>${calculation.id}</td>
            <td>${calculation.a}</td>
            <td>${calculation.b}</td>
            <td>${calculation.c}</td>
            <td>
                <c:choose>
                    <c:when test="${calculation.r_x2 != null}">x1 = ${calculation.r_x1}, x2 = ${calculation.r_x2}</c:when>
                    <c:otherwise>x = ${calculation.r_x1}</c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>