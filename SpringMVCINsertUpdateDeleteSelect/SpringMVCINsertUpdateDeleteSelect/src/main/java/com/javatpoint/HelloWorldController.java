package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.*;
import java.sql.*;
@Controller
public class HelloWorldController 
{

	@RequestMapping("/hello") //input 
	public ModelAndView helloWorld(HttpServletRequest req,HttpServletResponse res)
	{  String name=req.getParameter("t1");
	String add=req.getParameter("t2");
	String email=req.getParameter("t3");
	String phno=req.getParameter("t4");
	String doj=req.getParameter("t5");
	String proj=req.getParameter("t6");
	String action=req.getParameter("t7");
	if(action.equals("insert"))
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");


			PreparedStatement st=con.prepareStatement("insert into maremps123 values(?,?,?,?,?,?)");
			st.setString(1, name);
			st.setString(2,add);
			st.setString(3, email);
			st.setString(4,phno);
			st.setString(5, doj);
			st.setString(6,proj);
			st.execute();

		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		return new ModelAndView("hellopage","message","Row Inserted");
	}

	else if(action.equals("update"))
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			PreparedStatement st=con.prepareStatement("update maremps123 set address=?,email=?,phoneno=?,doj=?,projname=? where name=?");

			st.setString(1,add);
			st.setString(2, email);
			st.setString(3,phno);
			st.setString(4, doj);
			st.setString(5,proj);
			st.setString(6, name);
			st.executeUpdate();
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		return new ModelAndView("hellopage","message","Row updated");
	}
	else if(action.equals("delete"))
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			PreparedStatement st=con.prepareStatement("delete from maremps123 where name=?");
			st.setString(1, name);
			st.execute();
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		return new ModelAndView("hellopage","message","Row deleted");

	}
	else
	{
		
		return new ModelAndView("show","","");


	}

	}


}


