package encapsulation;

public class CarDriver
{
	public static void main(String[] args) 
	{
		Car c1=new Car("TATA","Nexon","Black",1400000.00,"SUV",5,"Automatic",5);
		c1.displayCar();
		
		System.out.println("======================");
		c1.e1.displayEngine();
		
		Car c2=new Car("TATA","Nexon","Brown",1200000.00,"SUV",5,"Manual",5);
		System.out.println("======================");
		
		c2.displayCar();
		System.out.println("======================");
		
		c2.e1.displayEngine();
		
		
	}

	
}
