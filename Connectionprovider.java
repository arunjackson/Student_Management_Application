package com.student.management;

//import java.sql.Connection ;
//
//import java.sql.DriverManager;
import java.sql.*;

//import java.lang.NullPointerException;


public class Connectionprovider 
{
	public static Connection con ;
public static Connection createC()
{
	try
	{
		
		
		//loading the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		// connection
		String url = "jdbc:mysql://localhost:3306/student_manage?user=root" ;
		String username ="root";
		String password ="arun";
		
		
      con =  DriverManager.getConnection(url, username, password);
      
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
	
	 
	
	
	
}
}
