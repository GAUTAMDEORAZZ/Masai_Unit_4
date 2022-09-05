import java.util.Scanner;

public class Main {
    public static String reverseString(String input){
        String str="";
        for(int i=input.length()-1;i>=0;i--){

          str =str + (input.charAt(i));
        }
        return str;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString=sc.next();

        String result=reverseString(originalString);

        System.out.println("Original String  is :-" +originalString);
        System.out.println("Reverse String is :- " +result);

    }
}
