package practice;

import java.util.Scanner;

public class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		
				int sum=1; //sum of Multiplication
				//int sum=0; sum of addition
		        int ans=0;
		        for(;num>0;num=num/10) 
		        {
		        	int rem=num%10;
		        	ans=ans*10+rem;
		        	
		        	sum=sum*rem;      //sum of multiplication
		        	//sum=sum+add    //sum of addition
		        	
		        }
		        System.out.println(sum);
		        
		        
		        	
	}

}
