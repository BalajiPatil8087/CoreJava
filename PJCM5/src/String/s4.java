package String;

public class s4 
{
	public static void main(String[] args) 
	{
		String s="India";
		System.out.println(s.charAt(4));
		System.out.println(s.concat("Is my country"));
		
		String s2="Aeroplane";
		System.out.println(s2.contains("plane"));
	    System.out.println(s2.indexOf(3));
		System.out.println(s2.isEmpty());
		System.out.println(s2.length());
		System.out.println(s2.replace('e', 'z'));
		System.out.println(s2.substring(4, 7));
		
		String s3="abc";
		char []c=s3.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
			
		}
		
	}

}
