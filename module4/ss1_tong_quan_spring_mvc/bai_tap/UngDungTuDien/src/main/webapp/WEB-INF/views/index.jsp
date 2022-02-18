<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Translate from English to Vietnamese</h1>
<form method="post" action="/translate">
    <label>
        <input type="text" name="word">
    </label>
    <input type="submit" value="Search">
</form>
<h2>${result}</h2>
</body>
</html>
