<%-- 
    Document   : books
    Created on : Mar. 21, 2022, 9:46:03 a.m.
    Author     : Ahsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books</title>
    </head>
    <body>
        <%
            String bookname = request.getParameter("bookname");
            Object value = session.getAttribute("books");
            ArrayList<String> books = null;
            if(value == null){
                books = new ArrayList<>();
            }else{
                books = (ArrayList<String>) value;
                
            }
            books.add(bookname);
            session.setAttribute("books", books);
        %>
        <h2>Books</h2>
        <h3>
        <%
            for(String Book : books){
                out.println(Book + "<br>");
            }
        
        %>
        </h3>
    </body>
</html>
