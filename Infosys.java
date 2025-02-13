package saurabh;
interface logic2
{
	void login1();
	void auth();
}

interface logic1 extends logic2
{
	void logout();
	void signin();
}
public class Infosys implements logic1
{
public static void main(String[] args) 
{
	Infosys i1=new Infosys();
	i1.auth();
	i1.login1();
	i1.logout();
	i1.signin();
}


public void login1() 
{
	System.out.println("here is the logic of login1");
	
}


public void auth() 
{
	System.out.println("here is the logic of auth");
}


public void logout() 
{
	System.out.println("here is the logic of logout");
}


public void signin() 
{
	System.out.println("here is the logic of signin");
}
}
