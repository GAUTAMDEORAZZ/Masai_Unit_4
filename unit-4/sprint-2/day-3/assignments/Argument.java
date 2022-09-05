public class Argument {

    public static void main(String[] args) {




            if(args.length==1){
                int x= Integer.parseInt(args[0]);
              
                int fact=1;
                for (int j = 1; j<x; j++) {
                    fact+=fact*j;
                }
                System.out.println(fact);
            }

            else if(args.length==2){
                int y=Integer.parseInt(args[1]);
                int x= Integer.parseInt(args[0]);

                int num=Math.abs(x-y);
                int fact=1;
                for (int j = 1; j<num; j++) {
                    fact+=fact*j;
                }
                System.out.println(fact);
            }

            else{
                System.out.println("Error");
            }


    }
}
