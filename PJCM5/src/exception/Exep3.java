package exception;

public class Exep3
{
	public static void main(String[] args)
	{
		divide(10,2);
		
	}
	public static void divide(int a,int b)
	{
		try 
		{
			int res=a/b;
			System.out.println(res);
			
		} catch (ArithmeticException e) 
		{
			System.out.println("Dont divivde by zero");
		}
		finally
		{
			System.out.println("thank you");
		}
	}

}
