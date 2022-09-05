package Problem2;

import java.util.Scanner;

public class Demo {
public boolean validate(String name, String mobileNum, String aadharCard) {
	 
	 boolean n= name.matches("[a-zA-Z]{3,8}");
	 boolean m=mobileNum.matches("[1-9]{1}[0-9]{9}");
	 boolean a=aadharCard.matches("[6785]{1}[0-9]{11}");
	 if(a && n && m) {
		
		 return true;
	 }
	
	 else {
		 if(a) {
			 System.out.println("Enter valid Name");
			
		 }
		 else if(m) {
			 System.out.println("Enter valid mobile number");
		 }
		 else {
			 System.err.println("Enter valid Adhar number");
		 }
		
		 return false; 
	 }
	
	
	}
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=sc.nextLine();
	System.out.println("Enter Your Mobile Number");
	String mobile=sc.nextLine();
	System.out.println("Enter Your Adhar Number");
	String adhar=sc.nextLine();
	
	Demo dem=new Demo();
	boolean data=dem.validate(name, mobile, adhar);
	if(data==true) {
		Citizen citizen=new Citizen();
		citizen.setName(name);
		citizen.setAadharNumber(adhar);
		citizen.setMobileNumber(mobile);
		citizen.display();
		
	}
	
}
}
