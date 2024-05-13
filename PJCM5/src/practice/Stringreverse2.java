package practice;

public class Stringreverse2 
{
	public static void main(String[] args) 
	{
		String r="iloveindia";
		String s="";
		
		for (int i =r.length()-1;i>=0;i--)//12
		{
			s=s+r.charAt(i);
			
			
		}
		System.out.println(s);
		
	}

}
