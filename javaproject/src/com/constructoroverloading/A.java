package com.constructoroverloading;

class A {
	int i=10;
	A()
	{
		System.out.println("from A");
		System.out.println(i);
		System.out.println(this);
		System.out.println(this.i);
	}
	A(int a)
	{
		System.out.println("from A(int)");
		System.out.println(a);
		System.out.println(i);
		System.out.println(this);
		System.out.println(this.i);
		i=a;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		A ob1=new A(100);
		System.out.println(ob1);
		System.out.println(ob1.i);
		A ob2=new A();
		System.out.println(ob2);
		System.out.println(ob2.i);
		

	}

}
