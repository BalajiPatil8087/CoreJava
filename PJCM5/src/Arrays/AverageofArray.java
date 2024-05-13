package Arrays;

public class AverageofArray 
{
	public static void main(String[] args) 
	{
		int a[]= {5,8,3,4,5};
		
		int a1=a.length;
		
		int sum=0;
		int avg=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			
			
		}
		System.out.println(sum);
		
		
	    avg=sum/a.length;
		System.out.println(avg);
		
	}

}
