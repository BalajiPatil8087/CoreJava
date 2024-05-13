package exception;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Exep 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter Numerator number");
			int num=s.nextInt();
			
			System.out.println("Enter denominator number");
			int num2=s.nextInt();
			
			int res=num/num2;
			System.out.println(res);
		
			Exep e1=new Exep();
			e1=null;
			
		} 
		catch (ArithmeticException e)
		{
			System.out.println("dont divide by zero");
			
			
		}
		catch(NullPointerException n)
		{
			System.out.println("Reference variable of of Exep is Null");
			
		}
		catch(InputMismatchException I)
		{
			System.out.println("Please enter valid input");
			
		}
		

		
	
		
	}

}
