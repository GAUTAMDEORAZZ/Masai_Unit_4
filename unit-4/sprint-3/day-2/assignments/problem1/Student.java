package problem1;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public Student() {

    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
//        this.grade=grade;

    }


    public char calculateGrade() {
        this.marks = marks;
        if (marks >= 500) {
            return 'A';
        } else if (marks < 500 && marks > 400) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return +roll+ " " +name+ " " + marks + " " +grade;
    }

    public void displayDetails() {

        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student roll no");
        s1.setRoll(input.nextInt());
        input.nextLine();
        System.out.println("Enter your name");
        s1.setName(input.nextLine());
        System.out.println("Enter your marks");
        s1.setMarks(input.nextInt());
        s1.setGrade(s1.calculateGrade());


        System.out.println("Roll No :" + s1.getRoll());
        System.out.println("Name :" + s1.getName());
        System.out.println("marks :" + s1.getMarks());
        System.out.println("grade :" + s1.getGrade());

    }
}
