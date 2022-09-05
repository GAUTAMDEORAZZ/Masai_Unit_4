import java.util.Scanner;

public class Student {
    int roll;
    String name;
    String address;
    int marks;
    int sum=0;
    public  void StudentDetails(){
        System.out.println("Name : " +name);
        System.out.println("Roll No : "+roll);
        System.out.println("Marks : "+marks);
    }

}
class Demo{
    public static void main(String[] args) {
        Student obj=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of Student");
        int num=input.nextInt();
        int sum=0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Roll No");
            obj.roll=input.nextInt();
            input.nextLine();
            System.out.println("Enter student name");
            obj.name=input.nextLine();
            System.out.println("Enter Your address");
            obj.address=input.nextLine();
            System.out.println("Enter your  marks");
            obj.marks=input.nextInt();
            sum=sum+obj.marks;
            System.out.println("Student Details" +(i+1));
            obj.StudentDetails();

        }
        int average=sum/num;
        System.out.println("The average of all student marks"+average);
    }
}
