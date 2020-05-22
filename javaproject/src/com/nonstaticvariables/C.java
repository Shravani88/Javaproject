package com.nonstaticvariables;

class C {
     int x=10;
	public static void main(String[] args) {
		C obj1= new C();
		System.out.println(obj1.x);
		System.out.println(obj1);
		C obj2=new C();
		System.out.println(obj2.x);
		obj1.x=20;
		System.out.println(obj1.x);
		System.out.println(obj2.x);

	}

}
