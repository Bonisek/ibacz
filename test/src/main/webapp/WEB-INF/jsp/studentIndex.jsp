<%-- 
    Document   : studentIndex
    Created on : 17-Jun-2016, 04:15:36
    Author     : Kristian Mateka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student index</title>
    </head>
    <body>
        <a href="/test/student/register">Create student</a>
    <table>
       <tr>
         <th><c:out value="Name" /></th>
         <th><c:out value="Surname" /></th>
         <th><c:out value="Birth" /></th>
         <th><c:out value="Gender" /></th>
       </tr>
     <c:forEach var="student" items="${list}">
       <tr>
         <td><c:out value="${student.name}" /></td>
         <td><c:out value="${student.surname}" /></td>
         <td><c:out value="${student.birth}" /></td>
         <td><c:out value="${student.gender}" /></td>
       </tr>
     </c:forEach>
     </table>
    </body>
</html>
