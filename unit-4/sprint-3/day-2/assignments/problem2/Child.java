package problem2;

import java.util.Scanner;

public final class Child extends Parent{
    @Override
    public void method1() {
        super.method1();
        System.out.println("inside the child class method-1");
    }
    public void method4(){
        System.out.println("inside the child class method-4");
    }

    public static void main(String[] args) {


//        obj1.method1();
//        obj1.method2();
//        obj1.method3();
        Parent obj1=new Child();
         Child obj2=(Child) obj1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10");
        obj2.number=input.nextInt();
        if(obj2.number>=1 && obj2.number<=10){
            obj2.method1();
        }
        else{
            System.out.println("Invalid number");
        }


         obj2.method2();
         obj2.method3();
         obj2.method4();
         
    }
}
