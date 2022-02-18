<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<head>
    <title>currency converter</title>
</head>
<h1>Chuyen doi tien te:</h1>
<form method="post" action="/convert">
    <label>USD: </label>
    <input type="text" name="usd">
    <br>
    <label>Exchange rate: </label>
    <input type="text" name="rate">
    <br>
    <input type="submit" value="Convert">
</form>
<h2>VND: ${result}</h2>
</body>
</html>
