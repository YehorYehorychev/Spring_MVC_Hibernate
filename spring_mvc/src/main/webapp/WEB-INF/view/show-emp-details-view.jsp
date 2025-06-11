<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are WELCOME!</h2>

<br>

Your first name is: ${employee.firstName}
<br>
Your last name is: ${employee.lastName}
<br>
Your salary is: ${employee.salary}
<br>
Your phone number is: ${employee.phoneNumber}
<br>
Your email is: ${employee.email}
<br>
Your department is: ${employee.department}
<br>
Your car is: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br>

</body>

</html>