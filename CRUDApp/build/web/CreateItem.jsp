<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Create a new Menu Item</title>
    </head>
    <body>
        <h1>Add a new Item</h1>
        <form action="AddItemServlet" method="post" class="addform">
            <label> ID:</label><input type="text" name="id" required id="txt"><p></p>
            <label> Category : </label><input type="text" name="category" required id="txt"><P></P>
            <label>Description :</label> <input type="text" name="description" required id="txt"><P></P>
            <label> Price : </label><input type="text" name="price" required id="txt"><P></P>
            <label>Vegetarian :</label> <input type="text" name="veg" required id="txt"><P></P>
            
             <input type="submit" value="submit">
        </form>
    </body>
</html>
