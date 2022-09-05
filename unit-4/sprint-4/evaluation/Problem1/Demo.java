package Problem1;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {
		
		if(bank.equals("axis")) {
			
			return new AxisBank();
		}
		
		else if(bank.equals("icici")) {
			
			return new ICICIBank();
		}
		else {
			
			return null;
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Bank name");
		String bankName=sc.nextLine();
		
		Demo obj= new Demo();
		Bank bank=obj.getBank(bankName);
		if(bank instanceof AxisBank) {
			AxisBank axis=(AxisBank)bank;
			axis.branchName="Ramgarh";
			axis.ifscCode="ifsc0012";
			axis.rateOfIntrest=12;
			axis.displayDetails();
			axis.getCreditCard();
		}
		else if(bank instanceof ICICIBank) {
			ICICIBank icic=(ICICIBank)bank;
			icic.branchName="Ranchi";
			icic.ifscCode="icc234";
			icic.rateOfIntrest=13;
			
			icic.displayDetails();
		}
		
	}

}
