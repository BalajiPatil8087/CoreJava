package Practice1;

import java.util.Scanner;

public class numbertochar 
{
	public static void main(String[] args)
	
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		System.out.println(convert(num));
		
		
	}
	public static final String[] units= {"","one","two","three","four","five ","six","seven","eight","nine","ten",
			"eleven","tweleve","thriteen","fourteen","fifthteen","sixteen","seventeen","eightteen","nineteen"};
	
	public static final String[] tens= {"","","Twenty","Thrity","Fourty","Fifty","sixty","Seventy","Eighty","ninety"};
	
	public static String convert(final int num)
	{
		if (num<0) 
		{
			return "minus" +convert(num);
			
		}
		if (num<20) 
		{
			return units[num];
			
		}
		if (num<100) 
		{
			return tens[num/10]+((num%10!=0)?"":"")+units[num%10];
			
		}
		if (num<1000) 
		{
			return units[num/100]+"hundred"+((num%100!=0)?"":"")+convert(num%100);
			
		}
		if (num<100000) 
		{
			return convert(num/1000)+"Thousand"+((num%1000!=0)?"":"")+convert(num%1000);
			
		}
		if (num<1000000) 
		{
			return convert(num/100000)+"Lakh"+((num%100000!=0)?"":"")+convert(num%100000);
			
		}
		return convert(num/100000000)+"core"+((num%10000000!=0)?"":"")+convert(num%10000000);
	
		
	}
			
}

