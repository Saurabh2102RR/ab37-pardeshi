//Assignmnet
package saurabh;
interface Sharda
{
	void signout();
}
interface Sayali
{
	void signin();
}
interface Shalaka
{
	void logout();
}
interface Shivani
{
	void login();
}
public class Assignment implements Shivani,Shalaka,Sayali,Sharda
{

	public static void main(String[] args) 
	{
		Assignment a1=new Assignment();
		a1.login();
		a1.logout();
		a1.signin();
		a1.signout();

	}
	public void signout()
	{
		System.out.println("Logic1");
		
	}
	public void signin() 
	{
		System.out.println("Logic2");
		
	}
	public void logout() 
	{
		System.out.println("Logic3");
		
	}
	public void login() 
	{
		
		System.out.println("Logic4");
	}

}
