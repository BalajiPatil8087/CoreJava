package inheritance;

public class Trainer 
{
	String name;
	String Qualification;
	double salary;
	int experiance;
	
	Trainer(){}
	
	Trainer(String name,String Qualification,double salary,int experiance)
	{
		this.name=name;
		this.Qualification=Qualification;
		this.salary=salary;
		this.experiance=experiance;
		
		
	}
	public void displayTrainer()
	{
		System.out.println("Name :"+name);
		System.out.println("Qualification :"+Qualification );
		System.out.println("salary :"+salary);
		System.out.println("Experiance :"+experiance +"years");
	}
	

}
