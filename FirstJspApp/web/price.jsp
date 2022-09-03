<%-- 
    Document   : price
    Created on : Mar. 17, 2022, 2:06:16 p.m.
    Author     : Ahsana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Price Calculation</title>
    </head>
    <body>
        <h2>Price evaluation</h2>
        <%! double price, tax; %>
        <%
            price = Double.parseDouble(request.getParameter("num"));
            tax = price * 0.15;
        %>
        <h4>Price is <%=price%></h4>
        <h4>Tax is <%=tax%></h4>
        <h4>Total is <%= price + tax%></h4>
    </body>
</html>
