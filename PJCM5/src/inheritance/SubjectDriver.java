package inheritance;

public class SubjectDriver 
{
	public static void main(String[] args) 
	{
		Subject s1=new Subject("Tejus","BE",50000.00,4,"Core java","Offline");
		s1.displaySubject();
		System.out.println("====================");
		s1.displayTrainer();
		
	}

}
