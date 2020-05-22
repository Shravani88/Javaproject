package com.constructorchaining;

class A {
	A()
	{
		System.out.println("from A()");
	}
	A(int i)
	{
		System.out.println("from A(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1= new A();
		A ob2=new A(10);

	}

}
