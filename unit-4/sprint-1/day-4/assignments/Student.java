public class Student {
    int roll;
    int marks;
    String name;
    int age;
     public Student(){
         name="Suresh";
         marks=70;
         roll=4;
         age=26;
     }
     public Student(int roll,int marks, int age, String name){
         this.roll=roll;
         this.age=age;
         this.name=name;
         this.marks=marks;
     }
     public void showDetails(){
         System.out.println("Student Name :"+name);
         System.out.println("Age :"+age);
         System.out.println("Roll No :"+roll);
         System.out.println("Marks :"+marks);
     }
     public static void main(String[] args) {
         Student obj1=new Student();
         obj1.showDetails();

         Student obj2=new Student(3,90,20,"Gautam");
         obj2.showDetails();




    }
}
