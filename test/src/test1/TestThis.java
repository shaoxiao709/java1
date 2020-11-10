package test1;

public class TestThis
{
	public static void main(String args[])
	{
		Leaf myLeaf = new Leaf();
		myLeaf = myLeaf.increment().increment().increment();
		myLeaf.print();
	}
}

class Leaf
{
	private int i = 0;
	Leaf increment() {
		i = i+1;
		return this;//返回值是leaf对象
	}
	
	void print() {
		System.out.println("i="+i);
	}
}