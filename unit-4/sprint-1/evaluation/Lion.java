public class Lion {
    String name;
    int age;
    boolean isHungry;
    static int totalDeaths;
   public static void printKillings(){

       System.out.println("Total kills by lions in jungle"+totalDeaths);

   }

      void thinking(){
       if(isHungry==false){
           System.out.println( name+ " is sleeping");
       }
       else if(age>12 && isHungry==true){
           System.out.println(name+ " has eaten two animal ");
           totalDeaths=totalDeaths+2;
       }
       else if(isHungry==true && age<=12 && age>=2){
           System.out.println(name+ " has eatem one animal");
           totalDeaths=totalDeaths+1;
       }

       else if(isHungry==true && age<=2){
           System.out.println(name+ " calling Mom");
       }

      }

    public static void main(String[] args) {
        Lion lion1=new Lion();
        Lion lion2=new Lion();
        Lion lion3=new Lion();

        lion1.name="lion1";
        lion1.isHungry=false;
        lion1.age=14;
        lion1.thinking();


        lion2.name="lion2";
        lion2.isHungry=true;
        lion2.age=16;
        lion2.thinking();


        lion3.name="lion3";
        lion3.isHungry=true;
        lion3.age=1;
        lion3.thinking();
        lion3.printKillings();




    }


}
