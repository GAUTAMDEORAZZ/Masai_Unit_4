public class Demo {
    public Demo(){
        this(4);
        System.out.println("This is first Demo");
    }
    public  Demo(String S){
        this(6.7f);
        System.out.println("This is second Demo");

    }
    public  Demo(int i){

        this("gautam");
        System.out.println("This is Third Demo");

    }
    public  Demo(float f){
        System.out.println("This is fourth Demo");
    }




    public static void main(String[] args) {
        Demo obj= new Demo();
//        obj=new Demo(4);
//        obj=new Demo("This is world");
//        obj=new Demo(5.6f);





    }
}
