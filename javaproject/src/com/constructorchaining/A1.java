package com.constructorchaining;

class A1 {
	A1()
	{
		System.out.println("from A()");
	}
	A1(int i)
	{
		this();
		System.out.println("from A(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ob1= new A1();
		A1 ob2=new A1(10);

	}

}
