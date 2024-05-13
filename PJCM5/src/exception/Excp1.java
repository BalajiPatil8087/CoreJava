package exception;
import java.util.Scanner;

public class Excp1 
{
	public static void main(String[] args)
	{
		System.out.println("Main begin");
		
		Scanner s=new Scanner(System.in);
		
		int n1=0,n2=0;
		
		try
		{
			System.out.println("Enter a first number");
			n1=s.nextInt();
			
			System.out.println("Enter a Second number");
			n2=s.nextInt();
		}catch (RuntimeException e) 
		{
			System.out.println("Enter a valid output");
			
		}
		try 
		{
			int res=n1/n2;
			System.out.println(res);
			
		} catch (ArithmeticException e)
		{
			System.out.println("please dont divide by zero");
			
			
		}
		System.out.println("main end");
		
		
		
	}

}
