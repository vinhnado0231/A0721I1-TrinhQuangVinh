<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new products</title>
</head>
<body>
<table>
    <form method="post">
        <tr>
            <td> Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td> Amount</td>
            <td><input type="text" name="amount"/></td>
        </tr>
        <tr>
            <td> Price</td>
            <td><input type="text" name="price"/></td>
        </tr>
        <tr>
            <td> Description:</td>
            <td><input type="text" name="description"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="create" value="create"></td>
        </tr>

    </form>
    <p>
        <a href="/products"> Back to product lists</a>
    </p>
</table>
</body>
</html>