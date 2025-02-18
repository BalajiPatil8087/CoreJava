package practice;

import java.util.Scanner;

public class NumberTowords 
{
	public static void main( String[] args)
	
	{
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(convert(s.nextInt()));
		
	}
	public static final String[] units= {"","one","two","Three","Four","five","six","seven","Eight","nine"
			,"Ten","Eleven","Twelve","thirteen","FourTeen","Fifthteen","Sixtten","SevenTeen","eighteen","Nineteen"};
	
	public static final String[] tens= {"","","Twenty","thirty","Fourty","Fifty","sixty","seventy","Eighty","ninety"};
	
	public static String convert(final int n)
	{
		if (n<0) 
		{
			return "Minus" + convert(-n);
			
		}
		if (n<20) 
		{
			return units[n];
			
		}
		if (n<100) 
		{
			return tens[n/10]+((n%10!=0)? " ":"")+units [n%10];
		}
		if (n<1000) 
		{
			return units[n/100]+"Hundred"+((n%100!=0)? " ":"")+convert(n%100);
		}
		if (n<100000) 
		{
			return convert(n/1000)+"Thousand"+((n%1000!=0)? " ":"")+convert(n%1000);
		}
		if(n<1000000)
		{
			return convert(n/100000)+"Lakh"+((n%1000!=0)? " ":"")+convert(n%100000);
			
		}
		return convert(n/10000000)+"core"+((n%10000000!=0)? " ":"")+convert(n%10000000);
	}
		
		
		
	}




