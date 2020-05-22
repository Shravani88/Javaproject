package com.encapsulation;

class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("shravani",34.9);
		System.out.println(e1.name);
		System.out.println(e1.getsalary());
		e1.setsalary(40);
		System.out.println(e1.getsalary());
		

	}

}
