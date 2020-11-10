package test1;


public class TestPolymorphism2{
	public static void main(String args[])
	{
		Employ_ee emp1 = new Employ_ee("����",23,1000f);
		System.out.println(emp1.getInfo());
		Employ_ee emp2 = new Manager("���",54,3000f,500f);
		Manager emp3 = new Manager("����",33,9000f,120f);
		System.out.println(emp2.getInfo());
		System.out.println(emp3.getInfo());
		System.out.println(emp3.name);
		System.out.println(emp3.allowance);
		System.out.println(emp3.getTotal());
	}
}

class Employ_ee{
	String name;
	int age;
	float salary;
	Employ_ee(){};
	Employ_ee(String name,int age,float sal){
		this.name = name;
		this.age = age;
		this.salary = sal;
	}
	String getInfo() {
		return "ְ������:" +name + "���䣺" + age + "���ʣ�" + salary; 
	}
}


class Manager extends Employ_ee{
	float allowance;
	Manager(String name,int age,float sal,float aa){
		this.name = name;
		this.age = age;
		salary = sal;
		allowance = aa;
	}
	String getInfo() {
		return "ְ������:" +name + "���䣺" + age + "���ʣ�" + salary + "������" + allowance; 
	}
	
	float getTotal()
	{
		return salary+allowance;
	}
}
