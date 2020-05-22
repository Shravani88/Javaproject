package com.methodoverriding;

class Square extends Rectangle {
	Square(int length,int breadth)
	{
		super(length,breadth);
		
	}
	void area()
	{
		int area=length*breadth;
		System.out.println("area is"+area);
	}

}
