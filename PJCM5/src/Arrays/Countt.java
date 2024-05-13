package Arrays;
import java.util.Scanner;

public class Countt 
{
	public static void main(String[] args) 
	{
		int a[]= {10,5,8,9,5};
		
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter value to be searched");
		int input=S.nextInt();
		
		int count=0;
				
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
	        	   System.out.println("element not found");
	           }
		
		
		
		
	}

}
