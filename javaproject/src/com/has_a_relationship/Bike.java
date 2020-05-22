package com.has_a_relationship;

class Bike {
	String colour;
	int speed;
	double mileage;
	Engine e=new Engine(4,325);
	Bike(String colour,int speed,double mileage)
	{
		this.colour=colour;
		this.speed=speed;
		this.mileage=mileage;
	}

}
