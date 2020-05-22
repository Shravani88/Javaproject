package com.nonstaticvariables;

class Reynolds {

	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.colour="red";
		m1.length=12;
		Marker m2=new Marker();
		m2.colour="blue";
		m2.length=11;
		Marker m3=new Marker();
		m3.colour="black";
		m3.length=10;
		System.out.println(m1.colour+" "+m1.length);
		System.out.println(m2.colour+" "+m2.length);
		System.out.println(m3.colour+" "+m3.length);

	}

}
