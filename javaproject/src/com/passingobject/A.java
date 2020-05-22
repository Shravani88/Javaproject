package com.passingobject;

public class A {
	int i=10;
	static void accept(A x)
	{
		System.out.println(x.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();
		accept(ob1);

	}

}
