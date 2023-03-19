package com.student.management;

public class Student 
{
	private int StudentId;
private String Studentname;
private String Studentphone;
private String Studentcity;

public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getStudentname() {
	return Studentname;
}
public void setStudentname(String studentname) {
	Studentname = studentname;
}
public String getStudentphone() {
	return Studentphone;
}
public void setStudentphone(String studentphone) {
	Studentphone = studentphone;
}
public String getStudentcity() {
	return Studentcity;
}
public void setStudentcity(String studentcity) {
	Studentcity = studentcity;
}
public Student(int studentId, String studentname, String studentphone, String studentcity) {
	super();
	StudentId = studentId;
	Studentname = studentname;
	Studentphone = studentphone;
	Studentcity = studentcity;
}
public Student(String studentname, String studentphone, String studentcity) {
	super();
	Studentname = studentname;
	Studentphone = studentphone;
	Studentcity = studentcity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [StudentId=" + StudentId + ", Studentname=" + Studentname + ", Studentphone=" + Studentphone
			+ ", Studentcity=" + Studentcity + "]";
}

}
