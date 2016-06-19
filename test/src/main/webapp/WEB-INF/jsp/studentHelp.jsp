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
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script src="../lib/jquery.js"></script>
        <script src="../dist/jquery.validate.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker({dateFormat: 'dd.mm.yy'}).val();
            });

            $().ready(function () {
                $('#studentForm').validate();
            });


        </script>
        <title>Student form ayyyy</title>
    </head>
    <body>
        <div align="center">
            <form class="cmxform" id="studentForm" method="get">
                <fieldset>
                    <legend>Student form</legend>
                    <p>
                        <label for="name">Name (required, 1 - 50 characters)</label>
                        <input id="name" name="nameField" minlength="1" maxlength="50" type="text" required>
                    </p>
                    <p>
                        <label for="surname">Surname (required, 1 - 50 characters)</label>
                        <input id="surname" name="surnameField" minlength="1" maxlength="50" type="text" required>
                    </p>
                    <p>
                        <label for="birth">Birth </label>
                        <input path="birth" name="birthField" type="text" id="datepicker" size="30">
                    </p>
                    <p>
                        <label for="gender">Gender</label>
                        <textarea id="gender" required></textarea>
                    </p>
                    <p>
                        <input class="submit" type="submit" value="Submit">
                    </p>
                </fieldset>
            </form>
        </div>
    </body>
</html>
