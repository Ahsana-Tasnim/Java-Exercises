/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "UploadServelet", urlPatterns = {"/upload"})
@MultipartConfig
public class UploadServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
        Part part = request.getPart("books");
        InputStream is = part.getInputStream();
        List<String> books = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        out.println("<h2>Book List</h2>");
        out.println("<ul>");
        while(true){
            String line = br.readLine();
            if(line == null){
                break;
            }
            books.add(line);
        }
        for(String book: books){
            out.println("<li>" + book + "</li>");
            out.println("</ul>");
        }
        }catch(Exception ex){
            System.out.println("File is not uploaded sucessfully" + ex.getMessage());
        }
    }

}
