<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>THE LIST OF CUSTOMER</title>
    <style>
        table {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }

        th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
</head>
<body>
<div style="text-align: left">
    <span>
        <p><a href="/customers?action=create">Create a new customer</a></p>
        <p><a href="/customers?action=search">Search a new customer</a></p>
    </span>
    <table border="1px solid black" style="border-collapse: collapse">
        <tr>
            <td>ID</td>
            <td>ID Of Type</td>
            <td>Full name</td>
            <td>Birthday</td>
            <td>Gender</td>
            <td>ID card</td>
            <td>Phone number</td>
            <td>Email</td>
            <td>Address</td>
            <td colspan="2">Action</td>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.getId()}</td>
                <td>${customer.getTypeId()}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getBirthday()}</td>
                <c:choose>
                    <c:when test="${customer.getGender()==0}">
                        <td>Female</td>
                    </c:when>
                    <c:otherwise>
                        <td>Male</td>
                    </c:otherwise>
                </c:choose>
                <td>${customer.getIdCard()}</td>
                <td>${customer.getPhone()}</td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>
                <form action="/customers">
                    <input type="hidden" name="id" value="${customer.getId()}">
                    <td>
                        <button name="action" value="update">Update</button>
                    </td>
                    <td>
                        <button name="action" value="delete">Delete</button>
                    </td>
                </form>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>