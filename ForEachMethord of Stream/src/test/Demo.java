package test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo {
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(83);
		al.add(45);
		al.add(73);
		al.add(43);
		al.add(89);
		Stream<Integer> s=al.parallelStream();

		s.forEach(t->System.out.println(t));
		
	}
}
