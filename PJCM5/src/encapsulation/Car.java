package encapsulation;

public class Car 
{
	String Brand;
	String name;
	String color;
	double price;
	String type;
	int airbag;
	String gear;
	int seat;
	
	Engine e1=new Engine("Petrol",4,100.00,1000.00,"Sport");
	
	Car(){}
	
	Car(String Brand,String name,String color,double price,String type,int airbag,String gear,int seat)
	{
		this.Brand=Brand;
		this.name=name;
		this.color=color;
		this.price=price;
		this.type=type;
		this.airbag=airbag;
		this.seat=seat;
		this.gear=gear;
	}
	public void displayCar()
	{
		System.out.println("Brand :"+Brand);
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("Color :"+color);
		System.out.println("Type :"+type);
		System.out.println("Airbag :"+airbag);
		System.out.println("Gear :"+gear);
		System.out.println("Seat :"+seat);
	}
}
	
	


