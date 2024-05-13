package Practice1;

public class Stringreverse2 
{
	public static void main(String[] args) 
	{
		String s="java coding";
		String r="";
		
		for (int i=s.length()-1;i>=0;i--) 
		{
			r=r+s.charAt(i);
			
		}
		System.out.println(r);
		
	}

}
