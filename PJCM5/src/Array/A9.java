package Array;

public class A9 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		
		int a1=a.length;
		
		int sum=0;
		int avg=0;
		
		for (int i = 0; i < a.length; i++)
		{
			sum=sum+a[i];
			
			
		}
		System.out.println("the sum array is "+sum);
		for (int i = 0; i < a.length; i++)
		{
			avg=sum/a1;
		}
		System.out.println("The avg of array is "+avg);
		
	}

}
