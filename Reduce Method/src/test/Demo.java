package test;
import java.util.ArrayList;
public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(83);
		al.add(45);
		al.add(72);
		al.add(43);
		al.add(84);
		
		int x=al.stream().reduce(0, (a,b)->a+b);
		System.out.println(x);
	}
}
//The reduce method is used to reduce the elements of a stream to a single value.
//The reduce method takes a BinaryOperator as a parameter.