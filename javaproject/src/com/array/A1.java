package com.array;

class A1 {

	public static void main(String[] args) {
	   int a[]= {1,2,3,4,5,6,7};
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  if(i%2==0)
		  System.out.println(a[i]);
		  
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  if(i%2==1)
		  System.out.println(a[i]);
		  
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  if(i%3==0)
		  System.out.println(a[i]);
		  
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%2==1)
		  System.out.println(a[i]);
		  
	  }
	  


	  
	}

}
