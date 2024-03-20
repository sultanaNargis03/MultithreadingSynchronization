package thread.synchronization;

public class HSBCBank 
{
	int accountBal; //using static to achieve class level locking
	String name="Nargis";
	
	public HSBCBank(int accountBal)
	{
		this.accountBal=accountBal;
	}
	
	synchronized public void withdraw(int withdrawlAmount)
	{
		accountBal=this.accountBal-withdrawlAmount; 
	}
	synchronized public void deposit(int depositAmount)
	{
		accountBal=this.accountBal+depositAmount;
	}
	synchronized public void checkbalance()
	{
		System.out.println("Account balance is: "+accountBal);
	}
	public void editingProfile(String name)
	{
		this.name=name;
		System.out.println("Name changed to "+name);
	}
}
