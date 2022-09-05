public class primeFactor {
    void prime(int N){
        for(int i=1; i<=N; i++){
            if(N%i==0){
                System.out.println(+i);
            }
        }
    }
    public static void main(String[] args) {

        primeFactor obj=new primeFactor();
        obj.prime(12);

    }
}
