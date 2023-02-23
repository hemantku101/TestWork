package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        xyz:
       	 while(true) {
       		 System.out.println("Enter the pinNo:");
       		 int pinNo = s.nextInt();
       		 if(new CheckPinNo().verify(pinNo))
       		 {
       			 System.out.println("====Choice====");
       			 System.out.println("1.WithDraw \n 2.Deposit");
       			 System.out.println("Enter the Choice:");
       			 switch(s.nextInt())
       			 {
       			 case 1:
       				 System.out.println("100 rupees note avalable");
       				 System.out.println("Enter the amt:");
       				 int a1 = s.nextInt();
       				 if(a1>0 && a1%100==0)
       				 {
       					 //LambdaExpression
       					 Transaction wd = (int amt)->
       						 {
       							 if(amt<=Transaction.b.bal)
       							 {
       								System.out.println("Amt withDrawn:"+amt);
       								Transaction.b.bal=Transaction.b.bal-amt;
       								Transaction.b.getBalance();
       								System.out.println("Transaction completed...");
       							 }//end of if
       							 else
       							 {
       								 System.out.println("InSufficient fund..");
       							 }
       						 };

                             wd.process(a1);
       				 }//end of if
       				 else
       				 {
       					 System.out.println("Invalid amt...");
       				 }
       				 break xyz;
       			 case 2:
       				System.out.println("100 rupees note avalable");
       				 System.out.println("Enter the amt:");
       				 int a2 = s.nextInt();
       				 if(a2>0 && a2%100==0)
       				 {
       					 //LambdaExpression
       					 Transaction dp = (int amt)->
       						 {
       							 System.out.println("Amt deposited:"+amt);
       							 Transaction.b.bal=Transaction.b.bal+amt;
       							 Transaction.b.getBalance();
       							 System.out.println("Transaction Completed...");
       						 };
       					 dp.process(a2);
       				 }//end of if
       				 else
       				 {
       					 System.out.println("Invalid amt...");
       				 }
       				 break xyz;
       			 default:
       				 System.out.println("Invalid choice...");
       				 break xyz;
       			 }//end of switch
       		 }//end of if
       		 else
       		 {
       			count++;
       			System.out.println("Invalid pinNo...");
       		 }
       		 if(count==3)
       		 {
       			 System.out.println("Transaction blocked...");
       			 break xyz;
       		 }
       	 }//end of loop
        s.close();
	}
}