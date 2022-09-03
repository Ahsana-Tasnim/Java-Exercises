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
        
        <form action="DisplayServlet">
            <button type="submit">Back to main page</button>>
        </form>
    </body>
</html>
