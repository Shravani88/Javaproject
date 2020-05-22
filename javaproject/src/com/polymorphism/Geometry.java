package com.polymorphism;

class Geometry {

	public static void main(String[] args) {
		Shape s=new Shape();
		Rectangle r=new Rectangle(10,2);
		Circle c=new Circle(10);
		
		Shape [] shapes= {s,r,c,new Circle(2),new Rectangle(10,1)};
		for(int i=0;i<shapes.length;i++)
		{
			System.out.println(shapes[i]);
			shapes[i].area();
			System.out.println("------------------");
		}

	}

}
