package practice;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		
		int ans=0;
		while(num>0)
			{
			int rem=num%10;
			ans=ans*10+rem;
			num=num/10;
			}
		 System.out.println(ans);
		
	}

}
