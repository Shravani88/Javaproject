package com.methodoverriding;

class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(10,2);
		Circle circle=new Circle(2);
		Square square=new Square(10,10);
		Triangle triangle=new Triangle(2,10);
		rectangle.area();
		circle.area();
		square.area();
	    triangle.area();
		
		

	}

}
