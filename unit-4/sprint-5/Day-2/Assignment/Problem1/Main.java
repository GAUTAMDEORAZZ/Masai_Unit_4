package Problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your date of joining in dd-MM-yyyy format");
		
		try {
			String doj=sc.nextLine();
			EmployeeBonus obj=new EmployeeBonus();
			double bonus=obj.employeebonus(doj);
			System.out.println("You get bonus "+bonus);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		
			
		}
		

		
	}

}
