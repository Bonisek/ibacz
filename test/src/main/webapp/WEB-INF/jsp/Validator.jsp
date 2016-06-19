<%-- 
    Document   : Validator
    Created on : 19-Jun-2016, 03:14:22
    Author     : Kristian Mateka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>jQuery validation plug-in - main demo</title>
        <link rel="stylesheet" href="css/screen.css">
        <script src="../lib/jquery.js"></script>
        <script src="../dist/jquery.validate.js"></script>
        <script>
            $.validator.setDefaults({
                submitHandler: function () {
                    alert("submitted!");
                }
            });

            $().ready(function () {
                // validate the comment form when it is submitted
                $("#commentForm").validate();
            });

            $(function () {
                $("#datepicker").datepicker({dateFormat: 'dd.mm.yy'}).val();
            });
        </script>
        <style>#commentForm{width:500px;}#commentForm label{width:250px;}#commentForm label.error,#commentForm input.submit{margin-left:253px;}#signupForm{width:670px;}#signupForm label.error{margin-left:10px;width:auto;display:inline;}#newsletter_topics label.error{display:none;margin-left:103px;}</style>
    </head>
    <body>
        <div id="main">
            <form class="cmxform" id="commentForm" method="get" action="">
                <fieldset>
                    <legend>Student registration form</legend>
                    <p>
                        <label for="cname">Name (required, 1 - 50 characters)</label>
                        <input id="cname" name="name" minlength="1" maxlength="50" type="text" required>
                    </p>
                    <p>
                        <label for="csurname">Surname (required, 1 - 50 characters)</label>
                        <input id="csurname" name="surname" minlength="1" maxlength="50" type="text" required>
                    </p>
                    <p>
                        <label for="curl">Birth </label>
                        <input path="birth" type="text" id="datepicker" size="30">
                    </p>
                    <p>
                        <label for="ccomment">Your comment (required)</label>
                        <textarea id="ccomment" name="comment" required></textarea>
                    </p>
                    <p>
                        <input class="submit" type="submit" value="Submit">
                    </p>
                </fieldset>
            </form>

        </div>
    </body>
</html>

