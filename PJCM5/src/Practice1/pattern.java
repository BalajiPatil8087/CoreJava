package Practice1;


public class pattern {

	public static void main(String[] args) 
	{
		int i,j,k,p;
	    for ( i = 1; i < 5; i++) 
	    {
	    	for(j=5;j>i;j--)
	    	{
	    	   System.out.print(" ");	
	    	}
	    	for( k=1;k<=(2*i-1);k++)
	    	{
	    		System.out.print("1");
	    	}
			
	    	 System.out.println("");
		}
	    for ( i = 5; i > 1; i--) 
	    {
	    	for(j=5;j>i;j--)
	    	{
	    	   System.out.print(" ");	
	    	}
	    	for( k=1;k<=(2*i-1);k++)
	    	{
	    		System.out.print("1");
	    	}
			
	    	 System.out.println("");
		}

	}

}
