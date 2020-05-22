package com.nonstaticblocks;

class Demo2 {
	int i;
	{
		System.out.println("from IIB");
	}
	Demo2()
	{
		System.out.println("from demo2()");
	}
	Demo2(int i)
	{
		this.i=i;
		System.out.println("from demo(int)");
	}
	public static void main(String[] args)
	{
		Demo2 ob1=new Demo2();
		System.out.println(ob1.i);
		System.out.println("....................");
		Demo2 ob2=new Demo2(10);
		System.out.println(ob2.i);
	}

}
