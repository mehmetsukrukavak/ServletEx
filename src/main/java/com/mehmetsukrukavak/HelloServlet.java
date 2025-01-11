package com.mehmetsukrukavak;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Hello Servlet");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.write("<h2><b>Hello Servlet</b></h2>");
    }
}
