package com.is_a_relationship;

class Vehicle {
	String colour;
	int mileage;
	int speed;
	Vehicle(String colour,int mileage,int speed)
	{
		this.speed=speed;
		this.colour=colour;
		this.mileage=mileage;
	}
	void moves()
	{
		System.out.println("vehicle moves");
	}

}
