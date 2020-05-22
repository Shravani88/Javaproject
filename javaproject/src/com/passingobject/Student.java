package com.passingobject;

class Student {
	String name;
	int roll_no;
	Student(String name, int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
	static void studentdetails(Student s)
	{
		System.out.println("student name is"+s.name);
		System.out.println("student roll_no "+s.roll_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(" meghana",1);
		Student s2=new Student(" shravani",2);
		Student.studentdetails(s1);
		Student.studentdetails(s2);
		
		

	}

}
