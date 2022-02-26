<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Settings</h1>
</br>
<form:form action="/result" modelAttribute="setting" method="post">
    <label>Languages </label>
    <form:select path="language">
        <form:option value="English">English</form:option>
        <form:option value="Vietnamese">Vietnamese</form:option>
        <form:option value="Japanese">Japanese</form:option>
        <form:option value="Chinese">Chinese</form:option>
    </form:select></br>
    <label>Page Size:</label>
    <form:select path="pageSize">
        <form:option value="5">5</form:option>
        <form:option value="10">10</form:option>
        <form:option value="15">15</form:option>
        <form:option value="25">25</form:option>
        <form:option value="50">50</form:option>
        <form:option value="100">100</form:option>
    </form:select></br>
    <label>Spams filter</label>
    <form:checkbox path="spam" value="Enable spams filter"/>Enable spams filter</br>
    <label>Singature</label>
    <form:textarea path="signature"/></br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>