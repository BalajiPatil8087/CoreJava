package inheritance;

public class Dog extends Animal
{
	boolean tail;
	String breed;
	String hair;
	
	Dog(){}
	
	Dog(String name,int leg,String color,String type,String sound,boolean tail,String breed,String hair)
	{
		this.name=name;
		this.leg=leg;
		this.color=color;
		this.type=type;
		this.sound=sound;
		this.tail=tail;
		this.breed=breed;
		this.hair=hair;
	}
	public void displayDog()
	{
		displayAnimal();
		System.out.println("Tail :"+tail);
		System.out.println("Breed :"+breed);
		System.out.println("Hair :"+hair);
	}
   
}
