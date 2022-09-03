<%-- 
    Document   : index
    Created on : Mar. 28, 2022, 8:35:57 a.m.
    Author     : Ahsana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL core tag</title>
    </head>
    <body>
        <c:set var="a" value="10" scope="session"/>
        <h2>${a}</h2>
        
        <c:forEach var="i" begin="0" end="20" step="2">
            <h3>${i}</h3>
        </c:forEach>
            
            <c:forEach var="program" items="Java, C#, PHP, Python, Angular">
                <h3>${program}</h3>
            </c:forEach>
    </body>
</html>
