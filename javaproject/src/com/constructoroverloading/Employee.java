package com.constructoroverloading;

class Employee {
	int id;
	String name;
	double salary;
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1,"Ayeesh",175);
		Employee emp2=new Employee(2,"shravani",185.0);
		Employee emp3=new Employee(3,"runith",188.3);
		System.out.println(emp1.name+" "+emp1.id+" "+emp1.salary);
		System.out.println(emp2.name+" "+emp2.id+" "+emp2.salary);
		System.out.println(emp3.name+" "+emp3.id+" "+emp3.salary);

	}

}
