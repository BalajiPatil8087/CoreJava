package polymorphism;

public class AKMupdate extends AKM 
{
	int Firing_Speed;
	double Ammo_type;
	String Weapon_type;
	int Magzine_Capacity;
	String attach;
	String Color;
	
	AKMupdate(){}
	
	AKMupdate(int Firing_Speed,double Ammo_type,String Weapon_type,int Magzine_Capacity,String attach,String color)
	{
		this.Firing_Speed=Firing_Speed;
		this.Ammo_type=Ammo_type;
		this.Weapon_type=Weapon_type;
		this.Magzine_Capacity=Magzine_Capacity;
		this.attach=attach;
		this.Color=color;
		
	}
	public void displayAKM()
	{
		System.out.println("Firing_Speed :"+Firing_Speed);
		System.out.println("Ammo_type :"+Ammo_type +"mm");
		System.out.println("Weapon_Type :"+Weapon_type);
		System.out.println("Magzine_Capacity :"+Magzine_Capacity);
		System.out.println("Attach :"+attach);
		System.out.println("Color :"+Color);
		
		
	}

}
