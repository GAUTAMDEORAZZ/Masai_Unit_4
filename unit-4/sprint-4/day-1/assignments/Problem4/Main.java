package Problem4;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		Test t=new Test();
		int [] arr=t.display(num);
		String bag="";
		for (int i : arr) {
			
			if(i!=0) {
				bag=bag+i+" ";
			}
		}
		System.out.println(bag);

	}

}
