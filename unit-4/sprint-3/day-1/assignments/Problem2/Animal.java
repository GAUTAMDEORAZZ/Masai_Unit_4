package Problem2;

public class Animal {
    public void makeNoise() {
        System.out.println("Animal making Noise ");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }
}
    class Dog extends Animal{
        @Override
        public void makeNoise() {
            super.makeNoise();
            System.out.println("Barking.....");
        }
    }
    class Cat extends Animal{
        @Override
         public void makeNoise(){
            super.makeNoise();
             System.out.println("Meaw.....");
            }
    }
    class Tiger extends Animal{
        @Override
        public void makeNoise(){
            super.makeNoise();
            System.out.println("Roaring....");
        }
    }

 class Main{
     public static void main(String[] args) {
         int[] array= new int[3];

          Dog d1=new Dog();
          Cat c1=new Cat();
          Tiger t1=new Tiger();

          d1.makeNoise();
          d1.eat();
          d1.walk();

          c1.makeNoise();
          c1.eat();
          c1.walk();

          t1.makeNoise();
          t1.eat();
          t1.walk();


     }
 }
