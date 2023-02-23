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
				
		al.stream().map(a->a+5).forEach(a->System.out.println(a));
	}
}
//The map method is used to returns a stream consisting of 
//the results of applying the given function to the elements of this stream.