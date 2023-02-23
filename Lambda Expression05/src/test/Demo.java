package test;
//Find maximum
@FunctionalInterface
interface Test
{
	int max(int a,int b);
}

public class Demo {
	public static void main(String args[])
	{
		Test t=(a,b)->Integer.max(a, b);
		int z=t.max(30,20);
		System.out.println(z);
	}
}