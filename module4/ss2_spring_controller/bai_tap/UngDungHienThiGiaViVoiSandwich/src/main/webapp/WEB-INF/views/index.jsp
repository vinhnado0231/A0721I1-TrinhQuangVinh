<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<h1>Sandwich Condiments</h1>
<form method="post" action="/save">
    <input type="checkbox" name="condiment" value="Lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Sprouts">
    <label>Sprouts</label><br>
    <input type="submit" value="Save">
</form>
<br>
<label>
    Result: <c:if test="${not empty result}" >${result}</c:if>
</label>
</html>
