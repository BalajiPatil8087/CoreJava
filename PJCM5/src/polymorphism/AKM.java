package polymorphism;

public class AKM
{
	int Firing_Speed;
	double Ammo_type;
	String Weapon_type;
	int Magzine_Capacity;
	
	
	AKM(){}
	
	AKM(int Firing_Speed,double Ammo_type,String Weapon_type,int Magzine_Capacity)
	{
		
		this.Firing_Speed=Firing_Speed;
		this.Ammo_type=Ammo_type;
		this.Weapon_type=Weapon_type;
		this.Magzine_Capacity=Magzine_Capacity;
	}
	public void displayAKM()
	{
		System.out.println("Firing_Speed :"+Firing_Speed);
		System.out.println("Ammo_type :"+Ammo_type);

		System.out.println("Weapon_Type :"+Weapon_type);
		System.out.println("Magzine_Capacity :"+Magzine_Capacity);
		
		
	}

}
