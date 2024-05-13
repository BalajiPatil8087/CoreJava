package Object;

public class Student1Driver 
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1("omkar","Qspider",6,"CS","Male");
		
		
		Student1 s2=new Student1("omkar","Qspider",66,"CS","Male");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equal(s2));
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
