package Practice1;

public class maximum 
{
	public static void main(String[] args) 
	{
		int a[]= {98,910,76,32,908,12};
		int max=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max) 
			{
				max=a[i];
				
			}
			
			
		}
		System.out.println(max);
				
		
	}

}
