package com.nonstaticmethods;

class Nsm1 {
	void m1()
	{
		System.out.println("from m1()");
		
	}

	public static void main(String[] args)
	{
		Nsm1 obj1 = new Nsm1();
		obj1.m1();

	}

}
