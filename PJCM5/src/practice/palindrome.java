package practice;

import java.util.Scanner;

public class palindrome 

{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		
		int ans=0;
		int temp=num;
		while (num>0) 
		{
			int rem=num%10;
			ans=ans*10+rem;
			num=num/10;
			
		}
		System.out.println(ans);
		if (temp==ans) 
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not plaindrome");
		}
      
	}

}
