//Maximum number in array
package Array;
public class Maximumno 
{
	public static void main(String[] args) 
	{
		int a[]= {90,20,67,89,200};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max) 
			{
			    max=a[i];
			}
			
		}
		System.out.println("The maximum number is "+max);
	}

}
