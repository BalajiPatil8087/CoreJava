package inheritance;

public class DoctorDriver 
{
	public static void main(String[] args) 
	{
		Doctor d1=new Doctor("XYZ","MBBS",344371l,100,"8-5","New pune Hospital",1);
		d1.displayDoctor();
		
		System.out.println("====================");
		
		Orthopedic o1=new Orthopedic("Omkar","MBBS",12345l,1000,"10-5","New Satara Hospital",1,"MD","Bones");
		o1.displayOrthopedic();
		
		System.out.println("====================");
		
		Neurologist n1=new Neurologist("Shubham","MBBS",45678l,1500,"12-5"," Satara Hospital",2,"MD","Brain");
		n1.displayNeuro();
		d1.displayDoctor();

		
	}

}
