package Bubble;

public class Bubblesort 
{
	public static void main(String[] args) 
	{
		int a[]= {10,15,7,2,0};
		
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if (a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
		}
		System.out.println("The sorted elment are");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
	
	}

}
