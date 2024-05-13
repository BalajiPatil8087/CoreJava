package practice;

public class MiniumumArray 
{
	public static void main(String[] args) 
	{
		int a[]= {23,45,34,12,90};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<min) 
			{
				min=a[i];
				
			}
		}
		System.out.println("the minimum no is"+min);
		
	}

}
