<%-- 
    Document   : showcountry
    Created on : Mar. 21, 2022, 9:06:06 a.m.
    Author     : Ahsana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Country</title>
    </head>
    <body>
        <%
            String country = null;
            for(Cookie myCookie : request.getCookies()){
                if(myCookie.getName().equals("country")){
                    country = myCookie.getValue();
                    break;
                }
            }
            if(country == null){
                response.sendRedirect("createcountry.html");
            }else{
                out.println("Country is " + country);
            }
        %>
    </body>
</html>
