package test;



public class UsePhoneCard{
	public static void main(String args[])
	{
		PhoneCard1 myCard = new PhoneCard1(12345678,1234,50.0,"300");
		System.out.println(myCard.toString());
	}
}

class PhoneCard1
{
	long cardNumber;
	private int password;
	double balance;
	String connectNumber;
	boolean connected;
	
	PhoneCard1(long cn,int pw,double b,String s)
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
	void performDial()
	{
		if(connected)
			balance -= 0.5;
	}
	public String toString()
	{
		String s = "�绰���������" + connectNumber + "\n �绰�����ţ�" + cardNumber + "\n �绰������" + password + "\n ʣ���" + balance;
		if(connected)
			return (s+"\n�绰�ѽ�ͨ");
		else
			return (s+"\n�绰δ��ͨ");
	}
}