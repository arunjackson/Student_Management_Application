package com.student.management;

import java.sql.*;
import java.sql.PreparedStatement;



public class StudentDao
{
public static boolean insertstudent(Student st)   
{
	boolean f= false;
	
	
	try
	{
	
		//jdbc code...
		
	 Connection con = Connectionprovider.createC();
		
		String q = "insert into students(sname,sphone,scity) values(?,?,?)";
		//prepared stmt
		
		PreparedStatement pstmt = con.prepareStatement(q);
		//set 
		pstmt.setString(1, st.getStudentname());
		pstmt.setString(2, st.getStudentphone());
		pstmt.setString(3, st.getStudentcity());
		
		//execute 
		pstmt.executeUpdate();
       	f = true;


		
	}
	catch(Exception e)
	{
		
	
		
	} 
	
	return f;
	
	

}

public static boolean deleteStudent(int userID) {
	
	
boolean f= false;
	
	
	try
	{
	
		//jdbc code...
		
	 Connection con = Connectionprovider.createC();
		
		String q = "delete from students where sid=?";
		//prepared stmt
		
		PreparedStatement pstmt = con.prepareStatement(q);
		//set 
		
		pstmt.setInt(1, userID);
	
		
		//execute 
		pstmt.executeUpdate();
       	f = true;


		
	}
	catch(Exception e)
	{
		
	
		
	} 
	
	return f;
	
	
	
	
	
	
	
	
	
	
}

public static void displaytable() 
{

	
	
	try
	{
	
		//jdbc code...
		
	 Connection con = Connectionprovider.createC();
		
		String q = "select * from students";
		
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(q);
		System.out.println(" ");
		System.out.println(" Student table  ");
		
	while(set.next())
	{
		int id = set.getInt(1);
		String name = set.getString(2);
		String phone = set.getString(3);
		String city = set.getString(4);
		

		System.out.println(" ");
		System.out.println("Sid  : "+id);
		System.out.println("Sname  : "+name);
		System.out.println("Sphone  : "+phone);
		System.out.println("Scity : "+city);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" ");
	}
	
		
	
       

		
	}
	catch(Exception e)
	{
		
	
		
	} 
	

	
	
	
}
   
}
