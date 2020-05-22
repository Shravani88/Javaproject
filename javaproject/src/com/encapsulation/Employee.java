package com.encapsulation;

public class Employee {
	String name;
	private double salary;
	public Employee(String name, double salary)
	{
	this.name=name;
	this.salary=salary;
	}
	public double getsalary()
	{
		return this.salary;
	}
	public void setsalary(double salary)
	{
		if(salary>this.salary)
		{
			this.salary=salary;
			System.out.println("salary accepted");
		}
		else
		{
			System.out.println("salary not accepted");
		}
	}

}
