package com.returningobject;

public class A {
	int i;
	static A generateobject()
	{
		A ob=new A();
		return ob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x= generateobject();
		x.i=100;
		System.out.println(x.i);

	}

}
