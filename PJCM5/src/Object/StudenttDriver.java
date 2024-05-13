package Object;

public class StudenttDriver 
{
	public static void main(String[] args) 
	{
		Studentt s1=new Studentt("Guldu","Qspider",1,"java","Male");
		
		Studentt s2=new Studentt("Guldu","Qspider",1,"java","Male");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		
	}

}
