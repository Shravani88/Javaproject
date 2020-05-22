package com.methodoverriding;

class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth =breadth;
	}
	void area()
	{
		int area=length*breadth;
		System.out.println("area is "+area);
	}

}
