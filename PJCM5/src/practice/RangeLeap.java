package practice;

import java.util.Scanner;

public class RangeLeap 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a start year");
		int start=s.nextInt();
		
		System.out.println("enter a end year");
		int end=s.nextInt();
		
		for ( ; start < end; start++) 
		{
			if (start%4==0 && start%100!=0 || start%400==0) 
			{
				System.out.println(start);
				
			}
			
		}
		
		
	}

}
