<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Product List</title>
    </head>
    <body>
        <h1>Products</h1>
        
        <form action="CreateProduct.jsp">
            <button type="submit" class="addbtn">Add a new Product</button>
        </form>
        
        <table>
            <tr><th>Product ID</th><th>User ID</th><th>Name</th><th>Category</th><th>Price</th><th>Quantity</th></th><th>Available</th><th>Delete</th><th>Update</th></tr>
            
            <c:forEach items="${Products}" var="temp">
                <tr>
                    <td>${temp.productId}</td>
                    <td>${temp.userId}</td>
                    <td>${temp.name}</td>
                    <td>${temp.category}</td>    
                    <td>${temp.price}</td>
                    <td>${temp.quantity}</td>
                    <td>${temp.available}</td>
                    <td>
                    <form action="DeleteProductServlet">
                        <input type="hidden" name="productId" value="${temp.productId}">
                        <button type="submit" class="delbtn">Delete</button>
                    </form>
                    </td>
                    <td>
                    <form action="BuildOneProductServlet">
                        <input type="hidden" name="productId" value="${temp.productId}">
                        <button type="submit" class="updbtn">Update</button>
                        </form>
                    </td>
                    </tr>         
            </c:forEach>
        </table>
    </body>
</html>
