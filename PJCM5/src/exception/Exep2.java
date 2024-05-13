package exception;

public class Exep2 
{
	public static void main(String[] args)
	{
		try 
		{
			divide(10,5);
			
		} catch (Exception e) {
			System.out.println("dont dividwe by zero");
		}
		
	}
	public static void divide(int a,int b)
	{
		int res=a/b;
		System.out.println(res);
		
	}

}
