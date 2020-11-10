package test;

public class TestHiddenField
{
	public static void main(String args[])
	{
		D200_Card my200 = new D200_Card();
		my200.balance = 50.0;
		System.out.println("父类被隐藏的金额为："+my200.getBalance());
		if(my200.performDial())
			System.out.println("子类的剩余金额为：" +my200.balance);
		System.out.println("子类的剩余金额为：" +my200.getBalance());
	}
}

abstract class Phone_Card
{
	double balance;
	int money = 5000;
	
	abstract boolean performDial();
	double getBalance()
	{
		return balance;
	}
}

abstract class Number_PhoneCard extends Phone_Card
{
	
	
	long cardNumber;
	int passwd;
	String connectNumber;
	boolean connected;
	
	
	boolean performConnection(long cn,int pw)
	{
		if(cn == cardNumber && pw == passwd)
		{
			connected = true;
			return true;
		}
		else
			return false;
	}
}


class D200_Card extends Number_PhoneCard
{
	double additoryFee;
	double balance;
	
	boolean performDial()
	{
		if(balance > (0.5 + additoryFee))
		{
			balance -=(0.5 + additoryFee);
			return true;
		}
		else
			return false;
	}
	
	double getBalance()
	{
		return balance;
	}
}