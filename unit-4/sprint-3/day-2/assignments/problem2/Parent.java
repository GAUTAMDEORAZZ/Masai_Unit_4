package problem2;

public class Parent {
   public void method1(){
    System.out.println(this.number);
    System.out.println("inside the Parent class method-1");

    }
    public final void method2(){
     System.out.println("inside the Parent class method-2");
    }
    public void method3(){
     System.out.println("inside the parent class method-3");

    }
    int number;
}
