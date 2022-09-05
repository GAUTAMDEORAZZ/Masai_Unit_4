package Problem3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Start Date in the formate of dd-MM-yyyy");
	String StartDate=sc.nextLine();
	System.out.println("Enter the End Date in the formate of dd-MM-yyyy");
	String EndDate=sc.nextLine();
	LocalDate sd;
	LocalDate ed;
	try {
		sd=LocalDate.parse(StartDate,DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
		 ed=LocalDate.parse(EndDate,DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
		 
		 if(sd.isAfter(ed)) {
				System.out.println("Start date should be smaller than End date");
			}
		 else {
			 Period p=Period.between(sd, ed);
			 int days=p.getDays();
			 System.out.println("Total Wages ="+days*1200);
		 }
	} catch (DateTimeException e) {
		System.out.println("Please enter date in dd-MM-yyyy” format");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
