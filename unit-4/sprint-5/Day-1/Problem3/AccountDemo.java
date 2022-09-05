package Problem3;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account obj=new Account();
		System.out.println("Enter Amount you want to deposite");
		double  deposite=sc.nextDouble();
		obj.deposite(deposite);
		try {
			System.out.println("Enter amount you want to withdraw");
			double amount=sc.nextDouble();
			obj.withdraw(amount);
			System.out.println("Withdrawal Successfull");
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thankyou for using Our website");
		}
	
	}

}
