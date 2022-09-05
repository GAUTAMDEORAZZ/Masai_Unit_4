package Problem1;

public class TemporarayEmployee extends Employee {

	private int houseWorked;
	private int hourlyWages;
	
	public int getHouseWorked() {
		return houseWorked;
	}

	public void setHouseWorked(int houseWorked) {
		this.houseWorked = houseWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	public TemporarayEmployee(int employeeId,String employeeName,int houseWorked, int hourlyWages) {
		super.setEmployeeName(employeeName);
		super.setEmployeeId(employeeId);
		this.houseWorked=houseWorked;
		this.hourlyWages=hourlyWages;
	}

	@Override
	public void calculateSalary() {
		super.setSalary(hourlyWages*houseWorked);
		
	}
	
	

}
