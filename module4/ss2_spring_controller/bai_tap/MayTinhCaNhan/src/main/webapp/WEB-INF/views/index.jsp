<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/caculation" method="post">
    <label>${error}</label>
    <br>
    <input type="text" name="num1">
    <input type="text" name="num2">
    </br>
    <input type="submit" name="calc" value="Addition(+)">
    <input type="submit" name="calc" value="Subtraction(-)">
    <input type="submit" name="calc" value="Multiplication(X)">
    <input type="submit" name="calc" value="Division(/)">
</form>
<h2>Result ${result}</h2>
</body>
</html>