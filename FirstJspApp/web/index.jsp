<%-- 
    Document   : index
    Created on : Mar. 17, 2022, 1:47:04 p.m.
    Author     : Ahsana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello JSP</title>
    </head>
    <body>
        <h1>
        <% 
            out.println("Hello World");
        %>
        </h1>
        <%! int i = 17;%>
        
        <h4><%=i %></h4>
    </body>
</html>
