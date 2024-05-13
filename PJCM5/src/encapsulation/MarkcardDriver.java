package encapsulation;

public class MarkcardDriver
{
	public static void main(String[] args) 
	{
		Markcard m1 =new Markcard("Kolhapur","YCIS","balaji patil",5100,0202,234,79,98,89);
		
		System.out.println(m1.getUniversity());
		System.out.println(m1.getCollegename());
		System.out.println(m1.getCenterno());
		System.out.println(m1.getSchoolno());
		System.out.println("==================");
		
		m1.displaymarkcard();
		
		
		
		
	}

}
