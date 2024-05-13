package Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class City 
{
	public static void main(String[] args) 
	{
		ArrayList c1=new ArrayList();
		
		c1.add("satara");
		c1.add("pune");
		c1.add("Mumbai");
		c1.add("kolhapur");
		c1.add("Sangli");
		
		System.out.println(c1);
		
		
		ArrayList a1=new ArrayList();
		
		a1.add("India");
		a1.add("Sri lankha");
		a1.add("Bangladesh");
		a1.add("nepal");
		a1.add("Bankok");
		
		a1.addAll(c1);
		System.out.println(a1);
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a your city/county to be searched");
		String input=s.next();
		
		
		if (a1.contains(input)) 
		{
			System.out.println("Ihe city/country found");
			System.out.println("Ihe city/country found at "+"index:" +a1.indexOf(input));
			
		} 
		else
		{
			System.out.println("Ihe city/country  not found");

		}
	}

}
