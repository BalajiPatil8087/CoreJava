package Practice1;

public class secondlargest 
{

	public static void main(String[] args) 
	{
		int a[]= {23,90,67,89,98,12};
		int max1=0;
		int max2=0;
		
			for (int i = 0; i < a.length; i++) 
		{
			if (max1<a[i]) 
			{
				max2=max1;
				max1=a[i];
				
			}
			if (max2<a[i] && a[i]<max1) 
			{
				max2=a[i];
				
			}
			
			
		}
		System.out.println("second maximum no is "+max2);

	}

}
