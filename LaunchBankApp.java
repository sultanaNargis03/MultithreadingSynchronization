package thread.synchronization;

public class LaunchBankApp 
{
	public static void main(String[] args) 
	{
		HSBCBank alienAccount=new HSBCBank(8000);
		
		
		ATMThread atm=new ATMThread(alienAccount);
		atm.setName("ATM");
		
		GooglePayThread gpay=new GooglePayThread(alienAccount);
		atm.setName("GPay");
		
		PhonePayThread ppay=new PhonePayThread(alienAccount);
		atm.setName("PPay");
		
		atm.start();
		gpay.start();
		ppay.start();
		
	}
}
