<%-- 
    Document   : error
    Created on : Apr. 4, 2022, 12:40:06 a.m.
    Author     : Ahsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Error</h1>
        <p>${error}</p>
        
        <form action="DisplayServelet">
            <button type="submit">Back to main page</button>
        </form>
    </body>
</html>
