<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1 style="text-align: center">GENERAL HEALTH DECLARATION INFORMATION</h1>
<h3 style="text-align: center">( COVID-19 EPIDEMIC PREVENTION )</h3>
<h3 style="text-align: center;color:red">Warning: Declaring false information is a violation of Vietnamese law and may
    be subject to criminal handling</h3>
<form:form action="/result" modelAttribute="declare" method="post">
    <span>Full name </span>
    <form:input cssStyle="width: 30%; height: 50px" path="name"/>
    <span>Year of Birth </span>
    <form:input cssStyle="width: 30%; height: 50px" type="date" path="yearOfBirth"/><br/>
    <span>Gender</span>
    <form:select path="gender">
        <form:option value="Male">Male</form:option>
        <form:option value="Female">Female</form:option>
    </form:select>
    <span>Nationality</span>
    <form:select path="country">
        <form:option value="vietnamese">Vietnamese</form:option>
        <form:option value="american">American</form:option>
        <form:option value="chinese">Chinese</form:option>
        <form:option value="Australian">Australian</form:option>
        <form:option value="Other">Other</form:option>
    </form:select>
    <br>
    <span>Passport number / ID card</span>
    <form:input cssStyle="width: 30%; height: 50px" path="identifyNumber"/>
    <div>
        <span>Vehicle</span>
        <form:radiobutton path="transport" value="Plane"/>Plane
        <form:radiobutton path="transport" value="Train"/>Train
        <form:radiobutton path="transport" value="Car"/>Car
        <form:radiobutton path="transport" value="Ship"/>Ship
        <form:radiobutton path="transport" value="Personal"/>Personal
    </div>
    <br>
    <span>Vehicle code</span>
    <form:input cssStyle="width: 30%; height: 50px" path="vehicleNum"/>
    <span>Seat</span>
    <form:input cssStyle="height: 50px" path="seatNum"/>
    <br>
    <span>Start date</span>
    <form:input cssStyle="width: 20%; height: 50px" type="date" path="dayStart"/>
    <span>End date</span>
    <form:input cssStyle="width: 20%; height: 50px" type="date" path="dayEnd"/>
    <br>
    <span>In the last 14 days, which regions/ countries/ territories have you traveled to (may travel across multiple places)</span>
    <form:input cssStyle="width: 30%; height: 50px" path="cityArrived"/>
    <br>
    <h2>Contact address in Vietnam</h2>
    <br>
    <span>Province</span>
    <form:input cssStyle="width: 30%; height: 50px" path="city"/>
    <span>District</span>
    <form:input cssStyle="width: 30%; height: 50px" path="district"/>
    <span>Ward</span>
    <form:input cssStyle="width: 30%; height: 50px" path="ward"/>
    <br>
    <span>Number of houses, streets, locality / village / team</span>
    <form:input cssStyle="width: 50%; height: 50px" path="address"/>
    <br>
    <span>Phone </span>
    <br>
    <form:input cssStyle="width: 50%; height: 40px" path="phoneNum"/>
    <br>
    <span>Email</span>
    <br>
    <form:input cssStyle="width: 30%; height: 40px" path="email"/>
    <br>
    <span>During the past 14 days, you were in contact with</span>
    <br>
    <table style="width: 100%">
        <tr>
            <label>Sick or suspected person, infected with COVID-19</label>
            <td class="radio-select">
                <form:radiobutton path="history" value="Sick or suspected person, infected with COVID-19"/> Yes
            </td>
            <td class="radio-select">
                <form:radiobutton path="history" value=""/> No
            </td>
            <br/>
            <label>People from countries with COVID-19 disease</label>
            <td class="radio-select">
                <form:radiobutton path="history" value="People from countries with COVID-19 disease"/> Yes
            </td>
            <td class="radio-select">
                <form:radiobutton path="history" value=""/> No
            </td>
            <br/>
            <label>People with manifestations (fever, cough, shortness of breath, pneumonia)</label>
            <td class="radio-select">
                <form:radiobutton path="history"
                                  value="People with manifestations (fever, cough, shortness of breath, pneumonia)"/>
                Yes
            </td>
            <td class="radio-select">
                <form:radiobutton path="history" value=""/> No
            </td>
        </tr>
    </table>
    <br>
    <form:button id="button" type="submit">Submit</form:button>
</form:form>
</body>
</html>