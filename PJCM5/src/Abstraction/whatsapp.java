package Abstraction;

public interface whatsapp
{
    void messagesender(String ip);
	void audiosender();
	public abstract void emojisender();
	void photosender();
	
	
	
	void messagereceiver(String ip);
	void audioreceiver();
	public abstract void emojireceiver();
	void photoreceiver();
	void Status(String ip);

}
