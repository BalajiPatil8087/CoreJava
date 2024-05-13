package Practice1;

public class minimun 
{
	public static void main(String[] args) 
	{
		int a[] ={32,56,90,45,12,78,89};
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<min) 
			{
				min=a[i];
				
			}
			
		}
		System.out.println(min);		
	}

}
