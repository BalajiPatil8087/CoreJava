package encapsulation;

public class Sim 
{
	String Service;
	String Type;
	String size;
	long no;
	
	Sim(){}
	Sim(String Service,String Type,String size,long no)
	{
		this.no=no;
		this.Service=Service;
		this.Type=Type;
		this.size=size;
		
		
	}
	public void displaysim()
	{
		System.out.println("no :"+no);
		System.out.println("Service :"+Service);
		System.out.println("Type :"+Type);
		System.out.println("Size :"+size);
		System.out.println("=====================");
		
	}

}
