package com.methodchaining;

class B {
	int i;
	static B createobject()
	{
		return new B();
	}
	B initialize (int i)
	{
		this.i=i;
		return this;
	}
	void display()
	{
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createobject());
		System.out.println("*************");
		B ob= createobject();
		ob.initialize(100);
		System.out.println(ob.i);
		System.out.println("**************");
		B x= createobject().initialize(200);
		x.display();
		x.initialize(300);
		x.display();
		System.out.println("*************");
		createobject().initialize(1000).display();
		

	}

}
