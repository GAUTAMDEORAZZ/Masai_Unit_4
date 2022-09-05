package Problem1;

public class PermanentEmployee extends Employee {
	private  double basicPay;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public PermanentEmployee(int employeeId,String employeeName,double basicPay) {
		 super.setEmployeeId(employeeId);
		 super.setEmployeeName(employeeName);
		 this.basicPay=basicPay;
		
	}
	
	@Override
	public void calculateSalary() {
		
		super.setSalary(this.basicPay-(this.basicPay*0.12));
		
	}
	
	
	

}
