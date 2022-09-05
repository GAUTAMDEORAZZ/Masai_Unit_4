package Problem2;

import java.util.Iterator;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the Number of Element in the Array");
			int num=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Element in array");
			int [] array= new int[num];
			for (int i = 0; i <num; i++) {
				int data=Integer.parseInt(sc.nextLine());
				array[i]=data;
			}
			System.out.println("Enter the index of the array element you want to access");
			int index=Integer.parseInt(sc.nextLine());
			
			System.out.println("The array element at index" +index +"=" +array[index]);
			System.out.println("The array Element successfully accessed");
		} catch (NumberFormatException nfe) {
			System.out.println("java.lang.NumberFormatExceptio");
		}catch (IndexOutOfBoundsException iobe) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsExceptio");
			
		}
		catch (Exception e) {
		   System.out.println(e.getMessage());
		}
		
		
		
	}
}
