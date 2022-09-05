package Problem1;

public class Main {
	public static void main(String[] args) {
		
		
		
		 Loan loan =new Loan();
	
		double permanentEmployeeLoan=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
		double temporaryEmployeeLoan=loan.calculateLoanAmount(new TemporarayEmployee(2,"Name2",20,100));
		
		System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
		System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
		
		 
	}

}
