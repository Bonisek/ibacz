<%-- 
    Document   : RegistrationSuccess
    Created on : 17-Jun-2016, 02:42:43
    Author     : Kristian Mateka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
<title>Registration Success</title>
</head>
<body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${studentForm.name}</td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td>${studentForm.surname}</td>
            </tr>
            <tr>
                <td>Birth:</td>
                <td>${studentForm.birth}</td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>${studentForm.gender}</td>
            </tr>
 
        </table>
    </div>
</body>
</html>
