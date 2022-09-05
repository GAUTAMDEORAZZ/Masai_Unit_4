package Problem2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Problem1.InvalidAgeException;

public class Student {
	
	public int userDate(String dob) throws InvalidDateFormate {
		
		LocalDate c1=LocalDate.now();
		LocalDate u1;
		try {
			 u1=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		} catch (DateTimeException e) {
			InvalidDateFormate idf=new InvalidDateFormate("Please enter date in valid formate");
			throw idf;
			
			
		}
		 u1=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		Period p= Period.between(u1, c1);
		int age=p.getYears();
		
		if(c1.isAfter(u1))
		{
			return age;
		}
		else {
			InvalidDateFormate iae=new InvalidDateFormate("Date should not be in Future");
			throw iae;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date of birth in formate dd-MM-yyyy");
		
		try {
			String dob=sc.next();
			Student obj=new Student();
			int age=obj.userDate(dob);
			System.out.println("Your age is " +age+ "Year");
		} catch (InvalidDateFormate e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
