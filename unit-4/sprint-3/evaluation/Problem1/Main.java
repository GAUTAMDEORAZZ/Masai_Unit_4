package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Car obj= new Car();
        System.out.println("Enter the Number of Passenger");
         obj.setNumberOfPassenger(scanner.nextInt());
        System.out.println("Enter the Number of Km");
          obj.setNumberOfKms(scanner.nextInt());

          OLA myOla = new OLA();

         Car myCar= myOla.bookCar(obj.getNumberOfPassenger(), obj.getNumberOfKms());
        int res = myOla.calculateBill(obj);
        System.out.println("The total fare amount is" +res);

    }
}
