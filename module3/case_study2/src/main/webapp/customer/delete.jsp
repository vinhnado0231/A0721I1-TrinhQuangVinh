<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete A Customer</title>
    <style>
        #tb {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #tb td, #tb th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #tb tr:nth-child(even){background-color: #f2f2f2;}

        #tb tr:hover {background-color: #ddd;}

        #tb th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
</head>
<body>
<form action="/customers" id="delete_customer">
    <label for="delete_customer">Do you want to delete?</label>
    <table id="tb">
    <tr>
        <td>Customer Id</td>
        <td><input type="text" disabled value="${customer.getId()}" name="id"/></td>
    </tr>
    <tr>
        <td>Type Customer Id</td>
        <td>
            <c:choose>
            <c:when test="${customer.getTypeId()==1}">
        <td>Diamond</td>
        </c:when>
        <c:when test="${customer.getTypeId()==2}">
            <td>Platinum</td>
        </c:when>
        <c:when test="${customer.getTypeId()==3}">
            <td>Gold</td>
        </c:when>
        <c:when test="${customer.getTypeId()==4}">
            <td>Silver</td>
        </c:when>
        <c:otherwise>
            <td>Member</td>
        </c:otherwise>
        </c:choose>
        </td>
    </tr>
    <tr>
        <td>Name</td>
        <td><input type="text" disabled value="${customer.getName()}" name="name"/></td>
    </tr>
    <tr>
        <td>Birthday</td>
        <td><input type="date" disabled value="${customer.getBirthday()}" name="birthday"/></td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>
            <c:choose>
            <c:when test="${customer.getGender()==0}">
        <td>Female</td>
        </c:when>
        <c:otherwise>
            <td>Male</td>
        </c:otherwise>
        </c:choose></td>

    </tr>
    <tr>
        <td>Id Card</td>
        <td><input type="text" disabled value="${customer.getIdCard()}" name="id_card"/></td>
    </tr>
    <tr>
        <td>Phone</td>
        <td><input type="text" disabled value="${customer.getPhone()}" name="phone"/></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><input type="text" disabled value="${customer.getEmail()}" name="email"/></td>
    </tr>
    <tr>
        <td>Address</td>
        <td><input type="text" disabled value="${customer.getAddress()}" name="address"/></td>
    </tr>
    <tr>
        <td><a href="/customers">Back to customer's list</a></td>
        <td><input type="submit" value="Delete"></td>
    </tr>
    </table>
</form>
</body>
</html>