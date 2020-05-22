package com.nonstaticvariables;

class B {
      int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B obj1=new B();
       System.out.println(obj1.i);
       System.out.println(obj1);
       obj1.i=10;
       System.out.println(obj1.i);
	}

}
