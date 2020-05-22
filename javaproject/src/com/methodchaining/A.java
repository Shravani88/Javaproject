package com.methodchaining;

class A {
	int i;
	static A generateObject()
	{
		return new A();
	}
	A initialize(int i)
	{
		this.i=i;
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A ob1= generateObject();
		//ob1.initialize(100);
		//System.out.println(ob1.i);
		A ob2=generateObject().initialize(100);
		System.out.println(ob2.i);

	}

}
