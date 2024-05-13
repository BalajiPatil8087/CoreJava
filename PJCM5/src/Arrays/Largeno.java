package Arrays;

public class Largeno
{
     public static void main(String[] args) 
    {
    	 int a[]= {98,67,58,88,1,};
    	int max=a[0];
    	int count=0;
    	 for(int i=0;i<a.length;i++) 
    	 {
    		 if(max<a[i]) 
    		 {
    			 max=a[i];
    			 count++;
    		 }
    		 
    	 }
    	 System.out.println(max);
    	 System.out.println(count);
    	 
		
	}
}
