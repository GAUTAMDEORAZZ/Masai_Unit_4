package Problem2;

public class Citizen {
	private String name;
	private String aadharNumber;
	private String mobileNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void display() {
	 System.out.println("Name : "+name);
	 System.out.println("AdharNumber :"+aadharNumber);
	 System.out.println("MobileNumber :"+mobileNumber);
	}
	

}
