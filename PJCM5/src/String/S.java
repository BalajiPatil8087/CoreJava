package String;

public class S 
{
	public static void main(String[] args)
	{
		String s="Qspider";
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.concat("&jspider"));
		
		String p="Aerolane";
		System.out.println(p.contains("lane"));
		
		System.out.println(p.indexOf("o"));
		System.out.println(p.isEmpty());
		System.out.println(p.length());
		System.out.println(p.replace('A', 'E'));
		System.out.println(p.substring(1, 4));
		
		String q="sagar";
		char[]c=q.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(c[i]);
		}
		
	}

}
