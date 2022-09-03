<%-- 
    Document   : pricecal
    Created on : Mar. 17, 2022, 2:16:07 p.m.
    Author     : Ahsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="pricecal.jsp" method="post">
            Price : <input type="number" name="num" value="${param.num}">
            <br><br>
            <input type="submit" value="submit">
        </form>
        <ul>
            <h3>
      <%
            String input = request.getParameter("num");
            if(input != null){
                double price = Double.parseDouble(input);
                double tax = price * 0.15;
                double total = price + tax;
                
                out.println("<li>Price is " + price + "</li>");
                out.println("<li>Tax is " + tax + "</li>");
                out.println("<li> Total is " + total + "</li>");
            }
        %>
            </h3>
        </ul>
    </body>
</html>
