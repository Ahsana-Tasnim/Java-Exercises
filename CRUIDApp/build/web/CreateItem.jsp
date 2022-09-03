<%-- 
    Document   : CreateItem
    Created on : Apr. 4, 2022, 1:11:23 a.m.
    Author     : Ahsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a new Item</title>
    </head>
    <body>
        <h1>Add a new Item</h1>
        <form action="AddItemServlet" method="post" class="addform">
            <label>ID:</label> <input type="text" name="id" required id="txt">
            <label>Category:</label> <input type="text" name="category" required id="txt">
            <label>Description: </label><input type="text" name="description" required id="txt">
            <label>Price: </label><input type="number" name="price" required id="txt">
            <label>Vegetarian: </label><input type="text" name="veg" required id="txt">
            
            <input type="submit" value="submit">
        </form>
    </body>
</html>
