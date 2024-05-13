package Arrays;
import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args)
	{
		int a[]= {9,7,5,13,8};
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value to be searched");
		int input=s.nextInt();
		
		int i;
		for ( i = 0; i < a.length; i++) 
		{
			if (input==a[i])
			{
				System.out.println("The element found at "+i+" position");
				break;
				
			}
			
		}
		if (i==a.length) 
		{
			System.out.println("The element not found");
			
		}
		
		
		
		
	}

}
