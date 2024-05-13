//Minimumm number in array
package Array;

public class Minimumno 
{
	public static void main(String[] args) 
	{
		int a[]= {45,67,88,34,7,46};
		
		int min=a[0];
		
	    for (int i = 0; i < a.length; i++) 
	    {
	    	if (a[i]<min) 
	    	{
				min=a[i];
			}
			
		}
	    System.out.println("Thr minimum no is" +min);
		
	}

}
