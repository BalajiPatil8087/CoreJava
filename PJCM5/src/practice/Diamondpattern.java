package practice;

public class Diamondpattern 
{
	public static void main(String[] args)
	{
		int i,j,k;
		for(i=1;i<=5;i++)  //i=1
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("");
			}
			System.out.print("\n");
		}
		
		
		for(i=5;i>=1;i--)  
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
				
		
		
	}

}
