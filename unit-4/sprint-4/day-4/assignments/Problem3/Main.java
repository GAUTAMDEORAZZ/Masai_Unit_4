package Problem3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("start of main..");
		try {
		   Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			
			int num2 = sc.nextInt();
			 String message = null;
    	  
		   int num3 = num1 / num2;
		   System.out.println(num3);
   		if(num3 > 10){
       		message = "Welcome to Exception Handling ";
       		}
   		System.out.println("Message is :"+message.toUpperCase());
   		
		} catch (InputMismatchException nfe) {
			System.out.println("Enter valid Number");
			
		}
	    catch(ArithmeticException ae) {
	    	System.out.println("Num2 should not be zero");
	    }
	   catch (NullPointerException e) {
			System.out.println("String is null");
		}
	   System.out.println("end of main");
		}
}


