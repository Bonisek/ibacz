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
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<title>Student Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="register" method="post" commandName="student">
            <form:errors path="*" cssClass="errorblock" element="div" />
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Student Registration</h2></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                    <td><form:errors path="name" cssClass="error" /></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><form:input path="surname" /></td>
                    <td><form:errors path="surname" cssClass="error" /></td>
                </tr>
                <tr>
                    <td>Birth :</td>
                    <td><form:input path="birth" /></td>
                    <td><form:errors path="birth" cssClass="error" /></td>
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
