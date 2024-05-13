package Object;

public class StudentDriver 
{
	public static void main(String[] args)
	{
		Student s1=new Student("Guldu","Qspider",1,"Java","Male");
		System.out.println(s1);
		

		Student s2=new Student();
		System.out.println(s2);
		
		
		
		s1.displayStudent();

	}

}
