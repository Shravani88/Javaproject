package com.methodoverloading;

class Add {
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         add(2,3);
         add(2,3,4);
         add(2,3,4,5);
	}

}
