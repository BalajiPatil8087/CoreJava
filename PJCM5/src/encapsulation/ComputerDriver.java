package encapsulation;

public class ComputerDriver 
{
	public static void main(String[] args) 
	{
		Computer c1=new Computer("Asus",75000.00,16,"Black",2.5f);
		c1.displaycomputer();
		c1.connectprojector("General Procector", 2.37f,5000.00 ,"Front wall Celling mounted");
		c1.p1.displayProjector();
		
	}

}
