package org.sam;

public class Variable {
	 int a=10;
	 int b=100;
	private void var()
	{
		int a=120;
		System.out.println("the value of "+a);
	}
	public  void var1() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	
		Variable c=new Variable();
		System.out.println(c.a);
		c.var();
		System.out.println(c.a);
		Variable c1=new Variable();
		c1.var();
		System.out.println(c1.b);
	}

}
