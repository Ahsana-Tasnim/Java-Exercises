<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Show Menu Items</title>
    </head>
    <body>
        <h1>Menu Items</h1>
        <form action="CreateItem.jsp">
            <button type="submit" class="addbtn">Add a new Menu Item</button>
            
        </form>
        
        <table>
            <tr><th>ID</th><th>Category</th><th>Description</th><th>Price</th><th>Vegetarian</th><th></th><th></th></tr>
            
            <c:forEach items="${theMenuItems}" var="temp">
                <tr>
                    <td>${temp.id}</td>
                    <td>${temp.category}</td>
                    <td>${temp.description}</td>
                    <td>${temp.price}</td>
                    <td>${temp.vegetarian}</td>
                    
                    <td>
                    <form action="DeleteServlet">
                        <input type="hidden" name="id" value="${temp.id}">
                        <button type="submit" class="delbtn">Delete</button>
                    </form>
                    </td>
                    <td>
                    <form>
                        <input type="hidden" name="id" value="${temp.id}">
                        <button type="submit" class="updbtn">Update</button>
                        </form>
                    </td>
                    </tr>
                    
                    
            </c:forEach>
            
        </table>
    </body>
</html>
