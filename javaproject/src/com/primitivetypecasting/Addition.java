package com.primitivetypecasting;

class Addition 
{
	public static void add(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,10);
		add('A','B');
		add(10.09,10.11);
		add(10.01f,10.11f);

	}

}
