package encapsulation;

public class EmailDriver 
{
	public static void main(String[] args)
	{
		Email e1=new Email("patilbalaji","Sagar8087",1234);
		System.out.println(e1.getname());
		
		System.out.println(e1.getlogin("sagarpatil",8087));
		e1.setlog("Sagarpatil",8088);
	}

}
