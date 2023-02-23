package test;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of v1:");
        int v1 = s.nextInt();
        System.out.println("Enter the value of v2:");
        int v2 = s.nextInt();
        System.out.println("=====Choice=====");
        System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
        System.out.println("Enter the Choice:");
        switch(s.nextInt())
        {
        case 1:
        	//LambdaExpression
        	Arithmetic ad = (int x,int y)->x+y;
        	System.out.println("sum:"+ad.calculate(v1, v2));
        	break;
        case 2:
        	//LambdaExpression
        	Arithmetic sb = (int x,int y)-> x-y;
        	System.out.println("Sub:"+sb.calculate(v1, v2));
        	break;
        case 3:
        	//LambdaExpression
        	Arithmetic ml =(int x,int y)->x*y;
        	System.out.println("Mul:"+ml.calculate(v1, v2));
        	break;
        case 4:
        	//LambdaExpression
        	Arithmetic dv = (int x,int y)->(double)x/y;
        	System.out.println("div:"+dv.calculate(v1, v2));
        	break;
        case 5:
        	//LambdaExpression
        	Arithmetic md = (int x,int y)->x%y;
        	System.out.println("ModDiv:"+md.calculate(v1, v2));
        	break;
        default:
        	System.out.println("Invalid Choice....");
        }//end of switch
        s.close();
	}
}