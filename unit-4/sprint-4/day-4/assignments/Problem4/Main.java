package Problem4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Start main method");
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num=Integer.parseInt(sc.nextLine());
			
			System.out.println("The square value is : "+num*num);
			System.out.println("The work has been done successfully");
			
		} catch (NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer");
			
		}
		
	}

}
