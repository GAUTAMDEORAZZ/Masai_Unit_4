import java.util.Scanner;

public class Wap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String");
        String mess=input.nextLine();
        System.out.println("Enter the character you want to access");
        int pos=input.nextInt();

        char charPos=mess.charAt(pos);
        System.out.println("Character at position"+pos +"is :"+ "\n"+charPos);


    }
}
