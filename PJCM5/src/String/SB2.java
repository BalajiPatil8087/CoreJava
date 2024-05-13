package String;

public class SB2 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Qspider");
		
		StringBuffer s2=s1.append("Deccan");//StringBuffer and Builder
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s1.reverse());
		System.out.println(s1.deleteCharAt(4));
		
	
		String s3="jspider";
		String s4=s3.concat("Deccan");
		
		
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		
	}

}
