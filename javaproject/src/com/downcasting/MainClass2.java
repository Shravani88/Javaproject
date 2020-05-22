package com.downcasting;

class MainClass2 {
	public static void ShowDetails(A x)
	{
		System.out.println(x.i);
		if(x instanceof B)
		System.out.println(((B)x).j);
		if(x instanceof C)
		System.out.println(((C)x).k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();
		ShowDetails(ob1);
		B ob2=new B();
		ShowDetails(ob2);
		C ob3=new C();
		ShowDetails(ob3);

	}

}
