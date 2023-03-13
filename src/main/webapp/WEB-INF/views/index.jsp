<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expenses Tracking</title>
</head>
<body>
    <h1>Hello!</h1>
    <p>${message}</p>

    <c:forEach var="expense" items="${expenses}">
        <div>
            <h3>${expense.expenseName}</h3>
            <p>&#163;${expense.amount}</p>
        </div>
    </c:forEach>

</body>
</html>
