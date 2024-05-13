package Practice1;

public class bubblesort 
{
	public static void main(String[] args) 
	{
		int a[]= {12,443,9,21,78,45,23,89};
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
		System.out.println("Sorted element are");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println("The third largest no is "+a[size-3]);
	}
}
