package Arrays;

public class A3 
{
	public static void main(String[] args) 
	{
		int x[]= {1,2,3,4,5,6};
		
		int y [] =new int[x.length];
		
		for (int i = 0; i < y.length; i++) 
		{
			y[i]=x[i];
			
		}
		for (int i = 0; i < y.length; i++)
		{
			System.out.println(y[i]);
			
		}
		
	
    }

}
