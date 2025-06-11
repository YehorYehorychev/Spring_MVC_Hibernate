<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear Employee, please enter your information here:</h2>

<br><br>

<form:form action="showDetails" modelAttribute="employee">

    First Name: <form:input path="firstName" />
    <form:errors path="firstName" />
    <br><br>
    Last Name: <form:input path="lastName" />
    <form:errors path="lastName" />
    <br><br>
    Salary: <form:input path="salary" />
    <form:errors path="salary" />
    <br><br>
    Phone Number: <form:input path="phoneNumber" />
    <form:errors path="phoneNumber" />
    <br><br>
    Email: <form:input path="email" />
    <form:errors path="email" />
    <br><br>

    Department:
    <form:select path="department">
        <form:options items="${employee.departments}" />
    </form:select>
    <br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}" />
    <br><br>
    Foreign language(s):
    <form:checkboxes path="languages" items="${employee.languagesList}" />
    <br><br>

    <input type="submit" value="OK" />

</form:form>

</body>
</html>