package practice;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		
		int fact=1;
		for (; num >0; num--) 
		{
			fact=fact*num;
			
		}
		System.out.println(fact);
		
	}

}
