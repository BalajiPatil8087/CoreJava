package practice;

public class Secondlargest 
{
   public static void main(String[] args) 
   {
	  int a[]= {32,58,2,7,45,90,56};
	  
	  int max1=0;
	  int max2=0;
	  int max3=0;
	 
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
		  if (max3<a[i] && a[i]<max2 ) 
		  {
			 max3=a[i];
		  }
		  
		  
		
	  }
	  System.out.println("third maximum no is"+max3);
	
   }
}
