package test;

@FunctionalInterface
interface Test {
    String reverse(String n);
}

public class Demo {
	public static void main( String[] args ) {
        Test ref = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}
