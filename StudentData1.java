

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/StudentData")
public class StudentData1 extends GenericServlet 
{
public void init()
{System.out.println("init");}



@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String a=req.getParameter("t1");
String b=req.getParameter("t2");
String c=req.getParameter("t3");
pw.println("The StudentID is :"+a);
pw.println("<br>");
pw.println("The Student Name is :"+b);
pw.println("<br>");
pw.println("The Student Address is :"+c);
}
public void destroy()
{System.out.println("Destroy");}
}
