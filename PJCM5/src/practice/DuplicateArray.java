package practice;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int x[]= {2,5,5,7,8};
		
		int y[]= new int[x.length];
		
		for (int i = 0; i < y.length; i++) 
		{
			y[i]=x[i];
			
		}
		for (int i = 0; i < y.length; i++)
		{
			System.out.println(y[i]
					);
			
		}
		
	}

}
