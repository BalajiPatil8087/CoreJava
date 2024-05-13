package Arrays;

public class A4 
{
	public static void main(String[] args) 
	{
		int x[]= {10,20,30,40,50,60};
		
		int y [] =new int [x.length];
		
		int j=y.length-1;
		
		for (int i = 0; i < y.length; i++) 
		{
			y[i]=x[j];
			j--;
			
		}
		for (int i = 0; i < y.length; i++) 
		{
			System.out.println(y[i]);
			
		}
		
	}

}
