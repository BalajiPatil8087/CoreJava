package exception;

public class Exep1 
{
	public static void main(String[] args) 
	{
		try 
		{
			int ans=10/5;
			System.out.println(ans);
			
		} catch (ArithmeticException e) 
		{
			System.out.println("Dont divide by zero");
			
		}
		finally
		{
			System.out.println("Thank You");
		}
	}
	
	

}
