package com.polymorphism;

class Circle extends Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	void area()
	{
		double area=3.14*radius*radius;
		System.out.println("area is "+area);
	}

}
