/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ahsan
 */
@WebServlet(name = "greet", urlPatterns = {"/greet", "/wish"})
public class greet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();
        if(name == null)
            name = "Guest";
        
        int hour = LocalDateTime.now().getHour();
        pw.println("<h1>" + hour + "</h1>");
        
        String message = "Good Evening";
        
        if(hour < 12)
            message = "Good morning";
        if(hour > 12 && hour < 17)
            message = "Good afternoon";
        
        pw.println("<h2>" + message + "<t>" + name + "</h2>");
    }

}
