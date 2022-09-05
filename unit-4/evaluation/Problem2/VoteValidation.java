package Problem2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VoteValidation {
	
	public  VoteValidation(String dob) throws AgeInvalidException {
		 LocalDate ud;
		 LocalDate cd=LocalDate.now();
		try {
			 ud=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		} catch (DateTimeException e) {
			AgeInvalidException aie=new AgeInvalidException("Please pass the date in the proper formate");
			throw aie;
		}
		
		Period p=Period.between(ud, cd);
		if(p.getYears()>=18) {
			System.out.println("You are elligible to cast your vote");
		}
		
		
		else if(ud.isAfter(cd)) {
			AgeInvalidException fae=new AgeInvalidException("date of birth should not be in future");
			throw fae;
		}
		else if(p.getMonths()==0) {
			System.out.println("Happy Birthday, You are eligible to cast your vote");
		}
		else {
			System.out.println("You are not elligible to cast your vote");
		}
		
		
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your date of birth in formate dd-MM-yyyy");
		String dob=sc.nextLine();
		try {
			VoteValidation obj=new VoteValidation(dob);
		} catch (AgeInvalidException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

	

}
