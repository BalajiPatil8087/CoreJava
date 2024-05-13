package practice;

import java.util.Iterator;

public class dup
{
	public static void main(String[] args) 
	{
		int a[]= {10,30,50,60,56};//10th is store in last 5th place
		int b[]=new int[a.length];
		
		int j=b.length-1;
		for (int i = 0; i < b.length; i++)
		{
			b[j]=a[i];
			j--;
			
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]);
			
		}
		
	}

}
