<%-- 
    Document   : StudentRegistration
    Created on : 17-Jun-2016, 02:25:22
    Author     : Kristian Mateka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="register" method="post" commandName="studentForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Student Registration</h2></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><form:input path="surname" /></td>
                </tr>
                <tr>
                    <td>Birth :</td>
                    <td><form:input type="date" path="birth" /></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><form:select path="gender">
                            <form:options/>
                         </form:select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
