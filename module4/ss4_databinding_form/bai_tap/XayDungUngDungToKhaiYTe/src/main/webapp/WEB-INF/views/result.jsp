<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: red">Data Saved</h1>
<br/>
<h2>Check your infomation:</h2><br/>
<h2>Name: ${declare.name}</h2><br>
<h2>Year of Birth: ${declare.yearOfBirth}</h2><br>
<h2>Gender: ${declare.gender}</h2><br>
<h2>Nationality: ${declare.country}</h2><br>
<h2>Identity Number: ${declare.identifyNumber}</h2><br>
<h2>Vehicle: ${declare.transport}</h2><br>
<h2>Vehicle code: ${declare.vehicleNum}</h2><br>
<h2>Seat :${declare.seatNum}</h2><br>
<h2>Date Start${declare.dayStart}</h2><br>
<h2>Date End${declare.dayEnd}</h2><br>
<h2>City arrived: ${declare.cityArrived}</h2><br>
<h2>City: ${declare.city}</h2><br>
<h2>Address: ${declare.district}  &nbsp;</h2>
<h2>${declare.ward}  &nbsp;</h2>
<h2>Address: ${declare.address}</h2><br>
<h2>Phone: ${declare.phoneNum}</h2><br>
<h2>Email: ${declare.email}</h2><br><br>
<h2>History: ${declare.history}</h2><br>
</body>
</html>
