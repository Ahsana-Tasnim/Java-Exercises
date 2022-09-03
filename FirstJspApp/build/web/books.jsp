<%-- 
    Document   : books
    Created on : Mar. 17, 2022, 2:46:25 p.m.
    Author     : Ahsana
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="javax.sql.rowset.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Books</title>
    </head>
    <body>
        <h1>Books</h1>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            CachedRowSet row = RowSetProvider.newFactory().createCachedRowSet();
            
            row.setUrl("jdbc:mysql://localhost:3306/bookstoredb");
            row.setUsername("root");
            row.setPassword("Udayan2019");
            //row.setCommand("SELECT name, title from book JOIN users ON user_id = Users_user_id where user_id = 2;");
            row.setCommand("SELECT * FROM book");
            row.execute();
            %>
            
            <table>
                <tr>
                    <th>book_id</th>
                    <th>title</th>
                    <th>description</th>
                    <th>price</th>
                </tr>
            <%
            while(row.next()){
                String id = row.getString("book_id");
                String title = row.getString("title");
                String description = row.getString("description");
                String price = row.getString("price");
                
                String display = String.format("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>", id, title, description, price);
                out.println(display);
            }

        %>
            </table>
            </body>
</html>
