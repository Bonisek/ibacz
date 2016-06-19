<%-- 
    Document   : DatePicker
    Created on : 19-Jun-2016, 02:49:32
    Author     : Kristian Mateka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>jQuery UI Datepicker - Format date</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker({ dateFormat: 'dd.mm.yy' }).val();
  });
  </script>
</head>
<body>
 
<p>Date: <input type="text" id="datepicker" size="30"></p>

 
</body>
</html>