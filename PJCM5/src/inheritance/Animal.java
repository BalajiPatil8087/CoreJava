package inheritance;

public class Animal
{
	String name;
	int leg;
	String color;
	String type;
	String sound;
	
	Animal(){}
	
	Animal(String name,int leg,String color,String type,String sound)
	{
		this.name=name;
		this.leg=leg;
		this.color=color;
		this.type=type;
		this.sound=sound;
		
	}
	public void displayAnimal()
	{
		System.out.println("Name :"+name);
		System.out.println("leg :"+leg);
		System.out.println("Color :"+color);
		System.out.println("Type :"+type);
		System.out.println("Sound :"+sound);
	}

}
