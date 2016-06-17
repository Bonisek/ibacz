<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<%! 
    public boolean parseString(String string){
        return string.matches("[0-9]+");
    }
    
    private int parse(String string){
        int number = 1;
        
        if(string.matches("[0-9]+")){
            number = Integer.parseInt(string);
        }
        
        return number;
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IBACZ</title>
    </head>
    <body>
        <h1>Hello</h1>
        <c:out value= "Hello Iba"/>
        <c:forEach begin="2" end="${param.x}" step="1">
            <c:out value= "Hello Iba"/>
        </c:forEach>
    </body>
</html>
