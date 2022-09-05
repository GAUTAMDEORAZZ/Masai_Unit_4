public class sumOfNatural {

    int sum(int N){
        int sum=(N*(N+1))/2;
        return sum;

    }
    public static void main(String[] args){
        sumOfNatural obj=new sumOfNatural();
        int result=obj.sum(5);
        System.out.println(+result);

    }

}
