<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a customer</title>
</head>
<body>
<form action="/customers">
    <table>
        <tr>
            <td>Customer Id</td>
            <td><input type="text" value="${customer.getId()}" name="id"/></td>
        </tr>
        <tr>
            <td>Type Customer Id</td>
            <td><select name="type_id" onselect="${customer.getTypeId()}">
                <option value="1">Diamond</option>
                <option value="2">Platinum</option>
                <option value="3">Gold</option>
                <option value="4">Silver</option>
                <option value="5">Member</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" value="${customer.getName()}" name="name"/></td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td><input type="date" value="${customer.getBirthday()}" name="birthday"/></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><select name="gender">
                <option value="1">Male</option>
                <option value="0">Female</option>
            </select></td>
        </tr>
        <tr>
            <td>Id Card</td>
            <td><input type="text" value="${customer.getIdCard()}" name="id_card"/></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><input type="text" value="${customer.getPhone()}" name="phone"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" value="${customer.getEmail()}" name="email"/></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" value="${customer.getAddress()}" name="address"/></td>
        </tr>
        <tr>
            <td><a href="/customers">Back to customer's list</a></td>
            <td><input type="submit" value="Update"></td>
        </tr>
    </table>
</form>
</body>
</html>

</body>
</html>