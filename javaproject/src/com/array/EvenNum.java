package com.array;

class EvenNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[6];
		for(int i=0,k=0;i<a.length;k++)
		{
		  if(k%2==0)
		  {
			  a[i]=k;
			  i++;
		  }
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
