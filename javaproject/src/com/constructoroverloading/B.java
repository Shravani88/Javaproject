package com.constructoroverloading;

class B {
	int i=10;
	boolean b=false;
	B()
	{
		System.out.println("from B()");
		System.out.println(i);
		System.out.println(b);
		System.out.println(this);
		System.out.println(this.i);
		System.out.println(this.b);
	}
	B(int x,boolean y)
	{
		System.out.println("from B(int, bool)");
		System.out.println(i);
		System.out.println(b);
		System.out.println(this.i);
		System.out.println(this.b);
		this.i=x;
		this.b=y;
		System.out.println(this.i);
		System.out.println(this.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B();
		System.out.println(ob1.i);
		System.out.println(ob1.b);
		System.out.println(ob1);
		B ob2=new B(123, false);
		System.out.println(ob2.i);
		System.out.println(ob2.b);
		System.out.println(ob2);
		

	}

}
