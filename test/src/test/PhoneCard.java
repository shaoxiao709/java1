package test;

public class PhoneCard {
	long cardNumber;
	private int password;
	double balance;
	String connectNumber;
	boolean connected;
	
	public PhoneCard(long cn,int pw,double b,String s)
	{
		cardNumber = cn;
		password = pw;
		if(b>0)
			balance = b;
		else
			System.exit(1);
		connectNumber = s;
		connected = false;
	}
	
	boolean performConnection(long cn,int pw)
	{
		if(cn == cardNumber && pw == password)
		{
			connected = true;
			return true;
		}
		else
		{
			connected = false;
			return false;
		}
	}
	
	double getBalance()
	{
		if(connected)
			return balance;
		else
			return -1;
	}
	public void performDial()
	{
		if(connected)
			balance -= 0.5;
	}

}
