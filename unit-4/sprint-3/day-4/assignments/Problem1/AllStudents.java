package Problem1;

import java.util.Scanner;

public class AllStudents {
    public static void main(String[] args) {
        Student history=new HistoryStudent();
        HistoryStudent history1=new HistoryStudent();
        ScienceStudent science1=new ScienceStudent();
        Student science=new ScienceStudent();

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the marks of history");
        history1.historyMarks= input.nextInt();
        System.out.println("Enter the marks of civivs");
        history1.civicsMarks= input.nextInt();


        System.out.println("Enter math marks");
        science1.mathsMarks= input.nextInt();
        System.out.println("Enter the marks of Chemistry");
        science1.chemistryMarks=input.nextInt();
        System.out.println("Enter the marks of Physics");
        science1.physicsMarks= input.nextInt();
        history1.getPercentage();
        science1.getPercentage();




    }
}
