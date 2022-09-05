package Problem1;

import java.util.Scanner;

public class UserRegistration {
	public void registerUser(String userName,String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
			
		}
		else {
			InvalidCountryException ice=new InvalidCountryException("User Outside India Cannot be registered");
			throw ice;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter Your Country");
		String country=sc.nextLine();
		UserRegistration obj=new UserRegistration();
		try {
			obj.registerUser(name, country);
		} catch (InvalidCountryException e) {
		
			System.out.println(e.getMessage());
		}
	
		

	}

}
