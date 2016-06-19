<%-- 
    Document   : studentIndex
    Created on : 17-Jun-2016, 04:15:36
    Author     : Kristian Mateka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student index</title>
    </head>
    <body>
        <a href="/test/student/register">Create student</a>
    <table border="2" cellpadding="2">
       <tr>
         <th><c:out value="Id" /></th>
         <th><c:out value="Name" /></th>
         <th><c:out value="Surname" /></th>
         <th><c:out value="Birth" /></th>
         <th><c:out value="Gender" /></th>
         <th colspan="2"><c:out value="Action" /></th>
       </tr>
     <c:forEach var="student" items="${list}">
       <tr>
         <td><c:out value="${student.id}" /></td>
         <td><c:out value="${student.name}" /></td>
         <td><c:out value="${student.surname}" /></td>
         <fmt:formatDate value="${student.birth}" pattern="dd.MM.yyyy" var="newdate" />
         <td><c:out value="${newdate}" /></td>
         <td><c:out value="${student.gender}" /></td>
         <td><c:out value="Edit"/></td>
         <td><c:out value="Delete"/></td>
       </tr>
     </c:forEach>
     </table>
    </body>
</html>
