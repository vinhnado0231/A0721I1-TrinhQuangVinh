<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Product</title>
</head>
<body>
<h1> Find Product </h1>
<a href="${pageContext.request.contextPath}/users">Back to user list</a>
<form method="post">
    <label>Find country:
        <input type="text" name="country"/>
    </label>
    <input type="submit" value="Submit">
</form>
</body>
</html>