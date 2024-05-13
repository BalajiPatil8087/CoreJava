package Binary;
import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The Element to be Searched");
		int key=s.nextInt();
		
		int a[]= {0,13,72,100,1012,2000,10000,100000};
		
		int start=0,  end=a.length-1,  mid=(start+end)/2;
		boolean found=false;
		
		
		for (int i = 0; i < a.length; i++) 
		{
			if (key==a[mid]) 
			{
				found=true;
				
		    }
			else if (key<a[mid]) 
			{
				end=mid-1;
				
			}
			else
			{
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		if (found==true) 
		{
			System.out.println("Element found at" +mid+ "index");
		}
	   else 
	   {
		   System.out.println("Element not found");
	   }
	}

}
