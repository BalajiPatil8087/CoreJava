
package Array;
import java.util.Scanner;


public class A6 
{
   public static void main(String[] args) 
   {
	   int a[]= {19,67,27,36,27,98};
	   Scanner s=new Scanner(System.in);
	   
	   System.out.println("Enter value to be reapted");
	   int intput=s.nextInt();
	   
	   int count=0;
	   for (int i = 0; i < a.length; i++) 
	   {
		   if (intput==a[i]) 
		   {
			   count++;  
			
		   }
		
	   }
	   if (count>0) 
	   {
		   System.out.println("the input is reapted "+count+" times");
	   }
	   else
	   {
		   System.out.println("the element not found");
	   }
	   
	
   }
}
