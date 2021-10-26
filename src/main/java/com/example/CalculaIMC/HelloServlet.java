package com.example.CalculaIMC;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

     double resultado;


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

       response.setContentType("text/html");
       PrintWriter out =response.getWriter();
       String valorA=request.getParameter("altura");
        String valorP=request.getParameter("peso");
          double a=Double.parseDouble(valorA);
          double b=Double.parseDouble(valorP);
          double resultado=b/(a*a);
            out.print("O Seu Indice de Massa Corporal =" + resultado);
            }

    public void destroy() {
    }
}