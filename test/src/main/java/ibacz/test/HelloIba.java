/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibacz.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kristian Mateka
 */
@WebServlet(name = "HelloIba", urlPatterns = {"/HelloIba"})
public class HelloIba extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
 
        int n = 1;
        String parameter = request.getParameter("x");
        
        if (parameter != null){
            n = parseString(parameter);
        }
        for (int i = 0; i < n; i++) {
            out.println("Hello IBA<br/>");
        }
    }
    
    private int parseString(String string){
        int number = 1;
        
        if(string.matches("[0-9]+")){
            number = Integer.parseInt(string);
        }
        
        return number;
    }
}
