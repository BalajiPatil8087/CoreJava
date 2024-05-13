package inheritance;

public class Subject extends Trainer
{
	String sub;
	String mode;
	
	Subject(){}
	
	
	Subject(String name,String Qualification,double salary,int experiance,String sub,String mode)
	{
		this.name=name;
		this.Qualification=Qualification;
		this.salary=salary;
		this.experiance=experiance;
		this.sub=sub;
		this.mode=mode;
		
	}
	public void displaySubject()
	{
		displayTrainer();
		System.out.println("Subject :"+sub);
		System.out.println("Mode :"+mode);
	}

}

