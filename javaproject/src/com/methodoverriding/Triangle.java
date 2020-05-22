package com.methodoverriding;

class Triangle extends Shape {
	int base;
	int height;
	Triangle(){
		
	}
	Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
		void area()
		{
			double area=0.2*base*height;
			System.out.println("area is"+area);
		}
	}


