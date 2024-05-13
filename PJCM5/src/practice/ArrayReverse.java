package practice;


import java.util.Scanner;

public class ArrayReverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a size of array");
		int size=s.nextInt();
		
		String s1[]=new String[size];
		
		System.out.println("Enter a country name");
		
		for (int i = 0; i < s1.length; i++) 
		{
			s1[i]=s.next();
			
		}
		for (int i=s1.length-1;i>=0;i--)
		{
			
			System.out.println(s1[i]);
		}
		
		
	
		
	}

}
