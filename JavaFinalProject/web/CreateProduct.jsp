<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Create a new Product</title>
    </head>
    <body>
        <h1>Add a new Product</h1>
        <form action="AddProductServlet" method="post" class="addform">
            <label><b>Product ID :</b>&nbsp;</label><input type="text" name="productId" required id="txt"><p></p>
            <label><b>User ID :</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="userId" required id="txt"><p></p>
            <label><b>Name :</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="name" required id="txt"><p></p>
            <label> <b>Category :</b> &nbsp;&nbsp;</label><input type="text" name="category" required id="txt"><P></P>
            <label> <b>Price :</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="number" name="price" required id="txt"><P></P>
            <label><b>Quantity :</b>&nbsp;&nbsp;</label> <input type="number" name="quantity" required id="txt"><P></P>
            <label><b>Available :</b>&nbsp;</label> <input type="text" name="available" required id="txt"><P></P>
            
             <input type="submit" value="Submit">
        </form>
    </body>
</html>
