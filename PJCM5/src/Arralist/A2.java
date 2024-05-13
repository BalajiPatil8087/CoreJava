package Arralist;
import java.util.ArrayList;
import java.util.Scanner;

public class A2
{
	public static void main(String[] args) 
	{
		ArrayList c1=new ArrayList();
		c1.add("Satara");
		c1.add("pune");
		c1.add("belgav");
		c1.add("banglore");
		c1.add("kolhapur");
		System.out.println(c1);
		
		ArrayList c2=new ArrayList();
		c2.add("India");
		c2.add("Sri_lankha");
		c2.add("nepal");
		c2.add("bankok");
		c2.add("India");
		System.out.println(c2);
		
		c1.addAll(c2);
		System.out.println(c1);//merge two arraylist
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter city or country to be searched");
		String input=s.next();
		
		if (c1.contains(input)) 
		{
			System.out.println("The city or country found at"+c1.indexOf(input));
			
		}
		else
		{
			System.out.println("City or country not found");
		}
				
			
			
		
		
		
	}

}
