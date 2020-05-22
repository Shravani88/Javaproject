package com.downcasting;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=null;
		ob1=new A();
		System.out.println(ob1.i);
		ob1=new B();
		B ob2=(B) ob1;
		System.out.println(ob2.j);

	}

}
