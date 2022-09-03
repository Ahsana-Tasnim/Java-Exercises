/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Ahsan
 */
@WebServlet(name = "UploadImageServelet", urlPatterns = {"/uploadimage"})
@MultipartConfig
public class UploadImageServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext ctx = this.getServletContext();
        try{
        Part part = request.getPart("image");
        InputStream is = part.getInputStream();
        String filename = part.getSubmittedFileName();
        System.out.println(filename);
        String targetFilename = ctx.getRealPath("/photos/" + filename);
        System.out.println(targetFilename);
        FileOutputStream fos = new FileOutputStream(targetFilename);
        fos.write(is.readAllBytes());
        fos.close();
        
        out.println("<h2>Image Uploaded successfully</h2>");
        }catch(Exception ex){
            System.out.println("Cannot save the image" + ex.getMessage());
        }
    }

}
