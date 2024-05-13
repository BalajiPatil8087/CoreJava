
//reverse country name
package Array;
import java.util.Scanner;

public class A2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		
		String c[]=new String[size];
		System.out.println("Enter a country name");
		
		for (int i = 0; i < c.length; i++) 
		{
			c[i]=s.next();
			
		}
		System.out.println("names enter successfully");
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
	}

}
