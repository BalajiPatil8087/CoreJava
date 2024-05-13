package Arrays;
import java.util.Scanner;

public class count 
{
	public static void main(String[] args) 
	{
		int a[]= {9,7,5,0,0};
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a value to reapted");
		int input=s.nextInt();
		
		int count =0;
		for (int i = 0; i < a.length; i++) 
		{
			if (input==a[i]) 
			{
				count++;
				
			}
			
			
		}
		if (count>0) 
		{
			System.out.println("input is reapted "+count+" times");
			
		}
		else
		{
			System.out.println("The element not found");
		}
		
		
	}

}
