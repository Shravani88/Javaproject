package com.nonstaticblocks;

class A1 {
	{
		System.out.println("from IIB-1");
	}
	public static void main(String[] args)
	{
		A1 ob1=new A1();
		A1 ob2=new A1();
		A1 ob3=new A1();
		
	}
	{
		System.out.println("from IIB-2");
	}

}
