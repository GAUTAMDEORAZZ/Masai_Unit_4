package Problem1;

public class ICICIBank extends Bank {
	double rateOfIntrest;
	
	@Override
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("rateOfIntrest :"+this.rateOfIntrest+"%");
	}

}
