package test;
import java.util.ArrayList;
import java.util.stream.*;
public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(83);
		al.add(45);
		al.add(72);
		al.add(43);
		al.add(84);
		
		Stream<Integer> s1=al.stream();
		
		Stream<Integer> s2=s1.filter(a->a%2==0);
		
		s2.forEach(a->System.out.println(a));
	}
}

//The filter method is used to select elements as per the Predicate passed as argument