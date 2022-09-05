package Problem1;

public class AxisBank extends Bank{
	
double rateOfIntrest;
	
	@Override
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("rateOfIntrest :  "+this.rateOfIntrest+"%");
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit card from the Axis bank");
	}

}
