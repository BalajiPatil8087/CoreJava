package String;

public class s1 
{
	public static void main(String[] args) 
	{
		String s1=new String("Qspider");
		String s2=new String("Qspider");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
	}

}
