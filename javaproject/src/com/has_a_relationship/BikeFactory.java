package com.has_a_relationship;

class BikeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike("RED", 180,27);
		System.out.println(b1.colour );
		System.out.println(b1.speed );
		System.out.println(b1.mileage );
		System.out.println(b1.e.stroke);
		System.out.println(b1.e.cc);

	}

}
