package Abstraction;

public abstract class whatsapp1 implements  whatsapp
{
	public void messagesender(String ip)
	{
		System.out.println(ip);
		
		System.out.println("Message sent !");
	}
	public void messagereceiver(String ip)
	{
		System.out.println(ip);
		
		System.out.println("Message sent !");
	}

}
