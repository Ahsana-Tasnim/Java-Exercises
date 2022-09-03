<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CustomersCss.css">
        <title>Create a new customer</title>
    </head>
    <body>
        <h1>Create New Customer</h1>
        <form action="AddItemServlet" method="post" class="addform">
            <label> ID:</label><input type="number" name="id" required id="txt"><p></p>
            <label> Name : </label><input type="text" name="name" required id="txt"><P></P>
            <label> Gender :</label> <input type="text" name="gender" required id="txt"><P></P>
            <label> Age : </label><input type="number" name="age" required id="txt"><P></P>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
