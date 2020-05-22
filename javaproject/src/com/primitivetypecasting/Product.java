package com.primitivetypecasting;

class Product {
	public static void multiply(double a, double b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply(10,10);
		multiply('A','B');
		multiply(10.09,10.11);
		multiply(10.01f,10.11f);

	}

}
