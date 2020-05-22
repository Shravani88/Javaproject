package com.non_primitive_array;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A(10);
		A[] a= {new A(12),ob1,new A(10)};
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j].i);
		}

	}

}
