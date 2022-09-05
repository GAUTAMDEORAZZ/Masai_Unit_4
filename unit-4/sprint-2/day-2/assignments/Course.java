import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

   public  void displayCourseDetails(){
        System.out.println(courseId);
        System.out.println(courseName);
        System.out.println(courseFee);
    }
    public static  void authenticate(String username,String password){
       if(username.equals("Admin") && password.equals("1234")){
           Course obj=new Course();
           Scanner input=new Scanner(System.in);
           System.out.println("Enter your course name");
           obj.courseName=input.nextLine();

           System.out.println("Enter your course id");
           obj.courseId= input.nextInt();
           System.out.println("Enter your course Fee");
           obj.courseFee=input.nextInt();
           obj.displayCourseDetails();
       }
       else{
           System.out.println("Invalid Username or password");
       }


    }

    public static void main(String[] args) {
      authenticate("Admin","1234");
      authenticate("Pablo","123");

    }

}
