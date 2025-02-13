//Assignment
package saurabh;
interface Vijay
{
	void signin();
}

interface Mohit extends Vijay
{
	void logout();
}

interface Rohit extends Mohit
{
	void login();
	
}

public class Assignment3 implements Rohit
{

	public static void main(String[] args) 
	{
		Assignment3 a1=new Assignment3();
		a1.login();
		a1.logout();
		a1.signin();

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}
