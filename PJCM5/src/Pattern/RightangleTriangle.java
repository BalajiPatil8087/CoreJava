package Pattern;

public class RightangleTriangle
{
	public static void main(String[] args) 
	{
		int i,j,count=0;
		for(i=1;i<=5;i++) 
		{
			for(j=1;j<=i;j++)
			{
				count++;
				System.out.print(count);     //for number print System.out.println(j)
			}                              //for number print System.out.println(i)122333444455555 
			System.out.print("\n");        //for 1,23,456,789 initilize with count=0 & count++
		}
	}
	

}
