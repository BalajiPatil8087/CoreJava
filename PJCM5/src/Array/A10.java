package Array;
import java.util.Scanner;

public class A10 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the value into array");
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("the value enter succesfully");
		for (int i=a.length-1;i>=0;i--) 
		{
			System.out.println(+a[i]);
			
		}
		
	}
	

}
