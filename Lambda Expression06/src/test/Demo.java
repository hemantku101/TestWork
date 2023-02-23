package test;
//Find prime number

@FunctionalInterface
interface Test
{
	void isPrime(int a);
}
public class Demo {
	static int count;
	public static void main(String args[]) {
		
		Test t=a->{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
					count++;
			}
			if(count==2)
			System.out.println(a+" is a prime number");
			else
				System.out.println(a+" is not a prime number");
		    };
		    t.isPrime(13);
	}
}
