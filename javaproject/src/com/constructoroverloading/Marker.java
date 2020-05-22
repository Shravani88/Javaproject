package com.constructoroverloading;

class Marker {
	Marker()
	{
		System.out.println("marker is created");
	}
	Marker(String colour)
	{
		System.out.println("marker is"+colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker m1=new Marker();
		Marker m2=new Marker("red");

	}

}
