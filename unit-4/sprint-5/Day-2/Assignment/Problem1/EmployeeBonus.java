package Problem1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {
	public double employeebonus(String doj) throws InvalidAgeException {
		LocalDate d1;
		
		
		try {
			 d1=LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			 
		} catch (DateTimeException e) {
			InvalidAgeException iae=new InvalidAgeException("“Please pass the date in the correct format");
			throw iae;
		}
		
		 d1=LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		  
		 LocalDate c1=LocalDate.now();
		Period p=Period.between(d1, c1);
		
		System.out.println(p.getYears());
		if(p.getYears()>=2) {
			return 10000;
			
		}
		else if(p.getYears()>1 && p.getYears()<2) {
			
			return 8000;
		}
		
		else if( p.getYears()>0) {
			return 5000;
		}
		else {
			InvalidAgeException iae=new InvalidAgeException("Age Should not be in the future");
			throw iae;
		}
		
		
		
	}

}
