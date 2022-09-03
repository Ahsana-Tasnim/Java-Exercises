<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CustomersCss.css">
        <title>Show All Customers</title>
    </head>
    <body>
        <h1>Customers</h1>
        
        <form action="CreateItem.jsp">
            <button type="submit" class="addbtn">Add a new Customer</button>
        </form>
        
        <table>
            <tr><th>ID</th><th>Name</th><th>Gender</th><th>Age</th><th></th><th></th></tr>
            
            <c:forEach items="${Customers}" var="temp">
                <tr>
                    <td>${temp.id}</td>
                    <td>${temp.name}</td>
                    <td>${temp.gender}</td>
                    <td>${temp.age}</td>                    
                    <td>
                    <form action="DeleteItemServlet">
                        <input type="hidden" name="id" value="${temp.id}">
                        <button type="submit" class="delbtn">Delete</button>
                    </form>
                    </td>
                    <td>
                    <form action="BuildItemServlet">
                        <input type="hidden" name="id" value="${temp.id}">
                        <button type="submit" class="updbtn">Update</button>
                        </form>
                    </td>
                    </tr>         
            </c:forEach>
        </table>
    </body>
</html>
