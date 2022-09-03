<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Update Product Details</title>
    </head>
    <body>
       <h1>Update Product</h1>
        
        <form action="UpdateProductServlet" method="post" class="addform">
            <label><b> Product ID:</b></label><input type="number" name="productId" value="${Product.productId}" required id="txt"><p></p>
            <label> <b>User ID:</b> &nbsp;&nbsp;&nbsp;&nbsp;</label><input type="number" name="userId" value="${Product.userId}" required id="txt"><p></p>
            <label> <b>Name :</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="name" value="${Product.name}" required id="txt"><P></P>
            <label> <b>Category:</b> &nbsp;&nbsp;</label><input type="text" name="category" value="${Product.category}" required id="txt"><p></p>
            <label> <b>Price :</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="number" name="price" value="${Product.price}" required id="txt"><P></P>
            <label> <b>Quantity:</b>&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="number" name="quantity" value="${Product.quantity}" required id="txt"><p></p>
            <label><b> Available :</b> &nbsp;</label><input type="text" name="available" value="${Product.available}" required id="txt"><P></P>
            <input type="submit" value="Update">
        </form>
    </body>
</html>
