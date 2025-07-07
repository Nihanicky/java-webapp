package com.student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StudentServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Hello from Student WebApp!</h2>");
    }
}
