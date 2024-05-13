package inheritance;

public class DeveloperDriver 
{
	public static void main(String[] args)
	{
		Developer d1=new Developer("BE","CS","pune",77.70,2021,"Programming","Tcs",2,"java",20000.00);
		d1.displayDeveloper();
		System.out.println("==================");
		d1.displaySoftwareEngineering();
		System.out.println("==================");
		d1.displayEngineering();
		System.out.println("==================");
	}

}
