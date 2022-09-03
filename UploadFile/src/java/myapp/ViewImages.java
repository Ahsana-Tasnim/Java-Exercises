/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ahsan
 */
@WebServlet(name = "ViewImages", urlPatterns = {"/View"})
public class ViewImages extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext ctx = this.getServletContext();
        try{
        File folder = new File(ctx.getRealPath("/photos/"));
        for (File file: folder.listFiles()){
            out.println("<img style=\"width:200px;height:250px\" src=\"photos/" + file.getName() + "\"/>" + file.getName());
        }
        }catch(Exception ex){
            System.out.println("Not Successful" + ex.getMessage());
        }
    }
}
