<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>New User Registration</title>
    </head>
    <body>
        <h1>Registration</h1>
        <form action="AddUserServlet" method="post" class="addform">
            <label><b>User ID:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="userId" required id="txt"><p></p>
            <label><b>Name:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="name" required id="txt"><p></p>
            <label><b> Email :</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="email" required id="txt"><P></P>
            <label> <b>Password : </b></label><input type="text" name="password" required id="txt"><P></P>
            <label> <b>City : </b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="city" required id="txt"><P></P>
            <label><b>Country :</b>&nbsp;&nbsp;&nbsp;</label> <input type="text" name="country" required id="txt"><P></P>
             <input type="submit" value="Submit">
        </form>
    </body>
</html>
