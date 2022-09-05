package Problem2;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		
		else if(amount>200 && amount<1000) {
			return new RoadSideHotel();
		}
		else {
			return null;
		}
	}
	
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=input.nextInt();
		
		if(amount<200) {
			System.out.println("Enter a valid amount");
		}
		
		else {
			Demo obj=new Demo();
			Hotel callobj=obj.provideFood(amount);
			callobj.chickenBiryani();
			callobj.masalaDosa();
			
			if(callobj instanceof TajHotel){
			TajHotel run =(TajHotel)callobj;
			run.welcomeDrink();
			}
		}
	}

}
