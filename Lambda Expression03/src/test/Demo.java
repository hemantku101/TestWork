package test;
//convert lower case to upper case
@FunctionalInterface
interface Test
{
	String upper(String s);
}

public class Demo {
	public static void main(String args[])
	{
		Test t=s->s.toUpperCase();
		String s1=t.upper("welcome");
		System.out.println(s1);
	}
}
