package com.student.management;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;





public class Start {

	public static void main(String[] args)  throws Exception
	{
		 
		System.out.println("Welcome to Student Management App");
		System.out.println(" ");
		System.out.println(" ");
		
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("press 1 to ADD Student ");
			System.out.println("press 2 to DELET Student");
			System.out.println("press 3 to DISPLAY Student");
			System.out.println("press 4 to EXIT  Student");
			System.out.println("");
			
			
   		     int c = Integer.parseInt(br.readLine());
	
		
		if (c ==1) 
		{
			//ADD Student 
			System.out.println("enter Student name");
			String name=br.readLine();
			
			System.out.println("enter Student phone number");
			String phone=br.readLine();
			
			System.out.println("enter Student city");
			String city=br.readLine();
			
			//create student objecte23e32e
			Student st = new Student(name,phone,city);
			
			boolean answer =StudentDao.insertstudent(st);
		
		if (answer)
		{
			System.out.println("student added succesfully");
		}else
		{
			System.out.println("something went wrong...try again");
		}
		
		
			System.out.println(st);
			
		}
		
		
		else if(c==2)
		{
			//DELET Student
			System.out.println("enter student ID to delete");
			int userID=Integer.parseInt(br.readLine());
			boolean f = StudentDao.deleteStudent(userID);
			if (f)
			{
				System.out.println("student deleted succesfully");
			}
			else
			{
				System.out.println("something went wrong...try again");
			}
		}
		
		else if(c==3)
		{
			StudentDao.displaytable();
		}
	
		else if (c==4)
		{
			System.out.println("thank you for using the app");
			break;
			
		}	else
	      {
			
		} 
		
		
		
		}
	}
	
	

}
