<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/discount">
    <span>Product Description: </span> <input type="text" name="productDescription"><br>
    <span>List Price: </span>    <input type="text" name="listPrice"><br>
    <span>Discount Percent: </span>  <input type="text" name="discountPercent"><br>
    <input type="submit" id="submit" value="Calculate Discount">
</form>
</body>
</html>