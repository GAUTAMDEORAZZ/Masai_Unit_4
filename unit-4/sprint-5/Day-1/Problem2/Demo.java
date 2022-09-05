package Problem2;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2  number");
		try {
			int a=Integer.parseInt(sc.next());
			int b=Integer.parseInt(sc.next());
			int result=a/b;
			System.out.println("The quotient of " +a+"/"+b+" =" +result);
			
		} catch (ArithmeticException ae) {
			System.out.println("DividedByZeroException caught");
		}catch (NumberFormatException nfe) {
			System.out.println("Please Enter valid Number");
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
