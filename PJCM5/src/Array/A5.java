
//search array and index of array
package Array;
import java.util.Scanner;

public class A5 
{
	public static void main(String[] args) 
	{
		int a[]= {9,19,35,67,98};
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value to be searched");
		int intput=s.nextInt();
		int i;
		for ( i = 0; i < a.length; i++)
		{
			if (a[i]==intput) 
			{
				System.out.println("the element found at index "+i+" position");
				break;
				
			}
			
		}
		if (i==a.length) 
		{
			System.out.println("the element not found");
			
		}
		
		
		
		
	}

}
