public class Student {

    String name;
    int rollNo;
    int marks;
    void displayStudentDetails(){
        System.out.println("Roll is :" +rollNo);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);

    }
    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2=new Student();
        obj1.name="Ramesh";
        obj1.rollNo=3;
        obj1.marks=80;
        obj1.displayStudentDetails();

        obj2.name="Gautam";
        obj2.rollNo=2;
        obj2.marks=90;
        obj2.displayStudentDetails();

    }
}
