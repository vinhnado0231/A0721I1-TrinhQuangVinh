<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form action="/matbang">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Trạng thái</td>
            <td><select name="status">
                <option value="1">Trống</option>
                <option value="2">Hạ Tầng</option>
                <option value="3">Đầy đủ</option>
            </select></td>
        </tr>
        <tr>
            <td>Diện tích</td>
            <td><input type="text" name="area"></td>
        </tr>
        <tr>
            <td>Tầng</td>
            <td><input type="text" name=floor></td>
        </tr>
        <tr>
            <td>-	Loại mặt bằng </td>
            <td><select name="status">
                <option value="1">Văn phòng chia sẻ</option>
                <option value="2">Văn phòng trọn gói</option>
            </select></td>
        </tr>
        <tr>
            <td>Ngày bắt đầu</td>
            <td><input type="text" name="dateStart"></td>
        </tr>
        <tr>
            <td>Ngày kết thúc</td>
            <td><input type="text" name="dateEnd"></td>
        </tr>
        <tr>
            <td><a href="/matbang">Trở về</a></td>
            <td><input type="submit" value="create"></td>
        </tr>
    </table>
</form>
</body>
</html>
