package Collections;

public class Contacts 
{
	String Name;
	double Phno;
	String Location;
    String Email;
    
    Contacts(){}
    
    Contacts(String Name,double Phno,String Location,String Email)
    {
    	this.Name=Name;
    	this.Phno=Phno;
    	this.Location=Location;
    	this.Email=Email;
    }
    
    public String toString()
    {
    	return"("+Name+ "---->"+Phno+")";
    }
}
