package Arrays;



public class CopyArray
{
   public static void main(String[] args)
   {
	  int a[]= {10,23,45,67};
	  int b[]=new int[a.length];
	  
	  int j=b.length-1;
	  for (int i = 0; i < b.length; i++) 
	  {
		b[i]=a[i];
		j--;
	  }
	  for (int i = 0; i < b.length; i++)
	  {
		 System.out.println(b[i]);
		
	}
	  
	  
		
	}
	   
	
  }

