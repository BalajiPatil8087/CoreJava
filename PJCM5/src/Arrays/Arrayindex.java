
//LineraSerach
package Arrays;
import java.util.Scanner;

public class Arrayindex 
{
	public static void main(String[] args) 
	{
		int a[]= {5,6,8,9,10};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a element to be searched");
		int input=s.nextInt();
	
		
		int i;
		for ( i = 0; i < a.length; i++)
		{
			if (input==a[i]) 
			{
				System.out.println("The elememt found at index"+i+"position");
				break;
				
			}
			
			
		}
	
		if (i==a.length)
		{
		
	       System.out.println("element not found");
		}
		
		
		
	}

}
