package encapsulation;

public class Computer 
{
	String brand;
	double price;
	int ram;
	String color;
	float processer;
	
	Projector p1=null;
	
	
	Computer(){}
	
	Computer(String brand,double price,int ram,String color,float processer)
	{
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.color=color;
		this.processer=processer;
		
	}
	public void connectprojector(String brand,float size,double price,String Projection_method)
	{
		p1=new Projector(brand,size,price,Projection_method);
		System.out.println("Projector connect successfully");
		
		
	}
	public void displaycomputer()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
		System.out.println("Ram :"+ram);
		System.out.println("Color :"+color);
		System.out.println("Processor :"+processer);
		System.out.println("==========================");
	}
}
	


