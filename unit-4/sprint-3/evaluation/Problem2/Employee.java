package Problem2;

import java.util.Scanner;

public class Employee {
    public float calculateAverage(int[] age){
        int sum=0;
        for (int i = 0; i <age.length ; i++) {
            sum=sum+age[i];
        }
        float avg=sum/age.length;
//        System.out.println("The average age is " +avg);
        return avg;


    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter total no of employee");
        int size=input.nextInt();
         if(size<2){
             System.out.println("Please enter a valid employee count");
         }
         else{
             int [] arr= new int[size];

             System.out.println("Enter the age of " +size + "employees");
             for(int i=0; i<size; i++){

                 int data= input.nextInt();
                 arr[i]=data;


             }



             Employee obj=new Employee();
            float average= obj.calculateAverage(arr);
             System.out.println("The average age is " +average);

         }

    }
}
