import java.util.Scanner;

public class Student {
    int rollNumber;
    String studentName;
    int marks;
    static int j = 1;

    public void Student() {

    }

    public void Student(int rollNumber, String studentName, int marks) {
        System.out.println("StudentDetails " + j++);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student name : " + studentName);
        System.out.println("student marks : " + marks);

    }
}
 class Main{
     public static void main(String[] args) {
         Student obj=new Student();
         Scanner input= new Scanner(System.in);
         System.out.println("Enter Number of Student you want to enter");
         int num=input.nextInt();

         for (int i = 0; i <num ; i++) {
             System.out.println("Enter the Roll Number");
             obj.rollNumber=input.nextInt();
             input.nextLine();
             System.out.println("Enter the Name");
             obj.studentName=input.nextLine();
             System.out.println("Enter the marks");
             obj.marks=input.nextInt();

             obj.Student(obj.rollNumber, obj.studentName, obj.marks);

         }





        }
    }


