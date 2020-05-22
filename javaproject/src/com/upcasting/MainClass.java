package com.upcasting;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o=null;
		o=new A();
		System.out.println(o.i);
		A o1=null;
		o1=new B();
		System.out.println(o1.i);
		//System.out.println(o1.j);
		

	}

}
