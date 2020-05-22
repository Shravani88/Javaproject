package com.is_a_relationship;

class Bike extends Vehicle {
	int cc;
	Bike(String colour,int mileage,int speed,int cc)
	{
		super(colour,mileage,speed);
		this.cc=cc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike("red",35,210,350);
		System.out.println(b1.colour);
		System.out.println(b1.mileage);
		System.out.println(b1.speed);
		System.out.println(b1.cc);

	}

}
