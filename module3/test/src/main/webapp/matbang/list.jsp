<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sach Mat Bang</title>
</head>
<body>
<div style="text-align: left">
    <span>
        <p><a href="/matbang?action=create">Thêm mới mặt bằng</a></p>
        <p><a href="/matbang?action=search">Tìm kiếm mặt bằng</a></p>
    </span>
    <table border="1px solid black" style="border-collapse: collapse">
        <tr>
            <th>ID</th>
            <th>Trạng thái</th>
            <th>Diện tích</th>
            <th>Tầng</th>
            <th>Loại mặt bằng</th>
            <th width="100">Giá tiền (Triệu đồng)</th>
            <th>Ngày bắt đầu</th>
            <th>Ngày kết thúc</th>
            <th>Chức năng</th>
        </tr>
        </tr>
        <c:forEach items="${matBangList}" var="matbang">
            <tr>
                <td>${matbang.getId()}</td>
                <td>${matbang.getStatus()}</td>
                <td>${matbang.getArea()}</td>
                <td>${matbang.getFloor()}</td>
                <td>${matbang.getType()}</td>
                <td>${matbang.getPrice()}</td>
                <td>${matbang.getDateStart()}</td>
                <td>${matbang.getDateEnd()}</td>
                <form action="/matbang">
                    <input type="hidden" name="id" value="${matbang.getId()}">
                    <td>
                        <button name="action" value="delete">Delete</button>
                    </td>
                </form>

            </tr>
        </c:forEach>
    </table>
    </table>
</div>
</body>
</html>
