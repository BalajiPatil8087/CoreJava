package encapsulation;

public class Engine 
{
	String fuel;
	int no_of_cylinder;
	double hp;
	double cc;
	String type;
	
	Engine(){}
	
	Engine(String fuel,int no_of_cylinder,double hp,double cc,String type)
	{
		this.cc=cc;
		this.fuel=fuel;
		this.hp=hp;
		this.type=type;
		this.no_of_cylinder=no_of_cylinder;
	}
	public void displayEngine()
	{
		System.out.println("CC :"+cc);
		System.out.println("Fuel :"+fuel);
		System.out.println("HP :"+hp);
		System.out.println("Type of Engine :"+type);
		System.out.println("No of Cylinder :"+no_of_cylinder);
	}
		
}


