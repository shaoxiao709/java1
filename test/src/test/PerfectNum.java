package test;

public class PerfectNum{
	public static void main(String args[])
	{
		int count = 1;
		TPerfectNum pn = new TPerfectNum();
		for(int i = 1;i < 10000;i++)
			if(pn.isPerfect(i))
				System.out.print(i+String.valueOf('\t'));
				count++;
				if(count%3 == 3)
					System.out.println();
	}
}

class TPerfectNum
{
	boolean isPerfect(int x)
	{
		int y = 0;
		for(int i=1;i<x;i++)
			if(x%i==0)
				y+=i;
		if(y==x)
			return true;
		else
			return false;
	}
}