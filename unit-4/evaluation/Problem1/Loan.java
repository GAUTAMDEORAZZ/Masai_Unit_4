package Problem1;

public class Loan {
	
	Loan() {
		
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee perObj=(PermanentEmployee)employeeObj;
			
			return (perObj.getSalary()*15)/100;
		}
		else {
			TemporarayEmployee tempObj=(TemporarayEmployee)employeeObj;
			
			return (tempObj.getSalary()*10)/100;
		}
	}

}
