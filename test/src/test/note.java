package test;
import java.io.*;
import java.util.ArrayList;

class Value{
	private int i;
	public void set(int i) {
		this.i = i;
	}
	public int get() {return i;}
}


public class note {
	//容器-动态修改的数组 
	//ArrayList<E> objectName =new ArrayList<>();　 // 初始化
	private ArrayList<String> notes= new ArrayList<String>();

	
	public void add(String s) {
		notes.add(s);
	}
	public int getSize() {
		return notes.size();
	}
	
	public void add(String s,int location) {
		notes.add(location, s);
	}
	
	public String getNode(int index) {
		return notes.get(index);
	}
	
	public boolean removeNote(int index) {
		return true;
	}
	
	public String[] list() {
		return new String[10];
	}
	 public static void main(String args[])
	 {
		 Value[] a = new Value[10];
		 for(int i =0;i<a.length;i++) {
			 a[i] = new Value();
			 a[i].set(i);
		 }
		 for(Value v:a)
		 {
			 System.out.println(v.get());
		 }
//		 note nb = new note();
//		 nb.add("first");
//		 nb.add("second");
//		 nb.add("third",1);
//		 nb.add("forth",3);
//		 for(int i=0;i<nb.getSize();i++)
//		 {
//			 System.out.println(nb.getNode(i));
//		 }
		 
	 }
	 
}
