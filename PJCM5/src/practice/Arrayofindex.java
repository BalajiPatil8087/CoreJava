package practice;

import java.util.Scanner;

public class Arrayofindex 
{
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	
	  int a[]= {1,25,676,78,8};
	  
	  System.out.println("Enter a number to be search");
	  int input=s.nextInt();
	  
	  int i;
	  for ( i = 0; i < a.length; i++) 
	  {
		  if (input==a[i]) 
		  {
			  System.out.println("The element found at index "+i+" position");
			  break;
			
		  }
		
		  
		
	}
	  if(i==a.length)
	  {
		  System.out.println("Element not found");
	  }
	  
	
	}

}
