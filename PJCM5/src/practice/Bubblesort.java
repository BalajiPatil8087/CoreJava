package practice;



public class Bubblesort 
{
	public static void main(String[] args) 
	
	{
		
		int a[]= {23,412,56,56,9,1,89};
		int size=a.length;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if (a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
		}
		
		System.out.println("the sorted element are");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println( a[i]);
		  
			
		}
		System.out.println("third largrest no is"+a[size-2]);
		
		 
		
		
	}
	

}
