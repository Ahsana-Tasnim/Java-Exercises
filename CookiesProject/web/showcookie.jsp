<%-- 
    Document   : showcookie
    Created on : Mar. 21, 2022, 8:48:48 a.m.
    Author     : Ahsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Showing Cookie</title>
    </head>
    <body>
        <h3>name is ${cookie.name.value}</h3>
        
        <%
            String name = null;
            for(Cookie myCookie : request.getCookies()){
                if(myCookie.getName().equals("name")){
                    name = myCookie.getValue();
                    break;
                }
            }
            if(name == null){
                out.println("Name is not provided");
            }else{
                out.println("Name is " + name);
            }
        
        %>
        
    </body>
</html>
