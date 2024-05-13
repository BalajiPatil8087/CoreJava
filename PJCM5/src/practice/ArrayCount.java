package practice;


import java.util.Scanner;

public class ArrayCount
{
	public static void main(String[] args) 
	{
		int a[]= {12,34,56,78,78,90};
		int count=0;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number to be Searched");
		int input=s.nextInt();
		int i;
		for ( i = 0; i < a.length; i++) 
		{
			if (input==a[i]) 
			{
				count++;
				
				
			}
			
		}
		if (count>0)
		{
			System.out.println("input is reapeated"+count+"+times");
			
			
		}
		else
		{
			System.out.println("Elemet not found");
		}
		
	}

}
