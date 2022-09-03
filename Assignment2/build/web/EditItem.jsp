<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CustomersCss.css">
        <title>Update Customer Details</title>
    </head>
    <body>
        <h1>Update Customer</h1>
        
        <form action="UpdateItemServlet" method="post" class="addform">
            <label> ID:</label><input type="number" name="id" value="${Customer.id}" required id="txt"><p></p>
            <label> Name : </label><input type="text" name="name" value="${Customer.name}" required id="txt"><P></P>
            <label> Gender :</label><input type="text" name="gender" value="${Customer.gender}" required id="txt"><P></P>
            <label> Age : </label><input type="number" name="age" value="${Customer.age}" required id="txt"><P></P>
            <input type="submit" value="update">
        </form>
    </body>
</html>
