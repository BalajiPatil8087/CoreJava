package practice;
public class MergeOfArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,0};
		
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		
		int c[]=new int[c1];
		
		for (int i = 0; i < a1; i++) 
		{
			c[i]=a[i];
			
			
		}
		for (int i = 0; i < b1; i++) 
		{
			c[a1+i]=b[i];
			
			
		}
		for (int i = 0; i < c1; i++)
		{
			System.out.println(c[i]);
			
		}
		
		
	}

}
