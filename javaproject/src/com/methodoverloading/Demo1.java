package com.methodoverloading;

class Demo1 {
	public static void m1()
	{
		System.out.println("hi");
	}
	public static int m1(int i)
	{
		System.out.println("hi");
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println(m1(10));

	}

}
