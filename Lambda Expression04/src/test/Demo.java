package test;
interface Test
{
	int cube(int a);
}
public class Demo {

	public static void main(String[] args) {
		Test t=a->a*a*a;
		int y=t.cube(2);
		System.out.println(y);
	}
}
