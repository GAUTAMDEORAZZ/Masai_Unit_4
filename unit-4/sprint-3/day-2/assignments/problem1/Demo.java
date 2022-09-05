package problem1;

public class Demo {
    public static void main(String[] args) {

         Student  obj1=new Student();
        obj1.setGrade(obj1.calculateGrade());
        obj1.displayDetails();

        Student obj3=new Student(12,"Ramesh",400);
        obj3.setGrade(obj3.calculateGrade());
        System.out.println(obj3.toString());
    }
}
