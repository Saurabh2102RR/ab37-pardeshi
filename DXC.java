//Saurabh
package saurabh;

interface Accenture
{
	void login();
}
abstract class CGI implements Accenture
{
	abstract void logout();
	static void add()
	{
		System.out.println("Perform Addition");
	}

}

public class DXC extends CGI
{

	public static void main(String[] args) 
	{
		DXC d1=new DXC();
		d1.login();
		d1.logout();

	}

	
	public void login() 
	{
		System.out.println("Perform login activity");
		
	}

	
	void logout() 
	{
		System.out.println("Perform logout activity");
		
	}

}
