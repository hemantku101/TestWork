package test;

public class Demo {
	public static void main(String args[])
	{
		Test t=(a,b)->a+b;
		int x=t.add(24,25);
		System.out.println(x);
	}
}
